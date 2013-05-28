package com.tekreliance.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tekreliance.domain.User;
import com.tekreliance.service.UserService;
import com.tekreliance.utils.RandomString;
import com.tekreliance.utils.Utils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * User: Jamshid Asatillayev
 * Date: 5/23/13
 * Time: 11:37 AM
 */
@Component
public class UserAction {
    private String id;
    private String userName;
    private String phone;
    private String password;
    private String birthDate;
    private String email;
    private String newPassword;
    private String oldPassword;

    private boolean wrongLogin;
    private User user = User.EMPTY_USER;

    @Autowired
    private UserService userService;

    @Action(value = "/login", results = {
            @Result(name = "profile", location = "/pages/profile.jsp"),
            @Result(name = "wrong", location = "/pages/login.jsp"),
            @Result(name = "success", location = "/pages/dashboard.jsp")
    })
    public String login() {
        user = userService.findUser(getEmail(), getPassword());
        Utils.setSessionAttribute("user", user);
        if (user != null) {
            if (user.isPasswordChanged()) {
                return "success";
            }
            return "profile";
        } else {
            setWrongLogin(true);
            return "wrong";
        }
    }

    @Action(value = "/changePassword", results = {
            @Result(name = "profile", location = "/pages/profile.jsp"),
            @Result(name = "success", location = "/pages/dashboard.jsp")
    })
    public String changePassword() {
        user = Utils.getSessionAttribute("user", User.class);
        if (!user.getPassword().equals(getOldPassword())) {
            return "profile";
        }
        user.setPassword(getNewPassword());
        user.setPasswordChanged(true);
        userService.saveUser(user);
        return "success";
    }

    @Action(value = "/", results = {@Result(name = "success", location = "/pages/login.jsp")})
    public String loginPage() {
        return "success";
    }

    @Action(value = "/registerPage", results = {@Result(name = "success", location = "/pages/register.jsp")})
    public String registerPage() throws ParseException {
        return "success";
    }

    @Action(value = "/register", results = {@Result(name = "success", location = "/pages/login.jsp")})
    public String register() throws ParseException {
        User user = new User();
        DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
        if (getBirthdate() != null) {
            user.setBirthDate(dateFormat.parse(getBirthdate()));
        }
        user.setEmail(getEmail());
        user.setPhone(getPhone());
        user.setUserName(getUsername());
        user.setPassword(new RandomString(7).nextString());
        userService.saveUser(user);
        return "success";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthdate() {
        return birthDate;
    }

    public void setBirthdate(String birthdate) {
        this.birthDate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setWrongLogin(boolean wrongLogin) {
        this.wrongLogin = wrongLogin;
    }

    public boolean isWrongLogin() {
        return wrongLogin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
}
