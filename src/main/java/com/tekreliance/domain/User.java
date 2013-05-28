package com.tekreliance.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * User: Jamshid Asatillayev
 * Date: 5/23/13
 * Time: 11:21 AM
 */
@Entity
@Table(name = "user")
public class User extends BaseEntity {
    public static final User EMPTY_USER = new User();
    @NotNull
    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "is_password_changed")
    private boolean isPasswordChanged;

    @Column(name = "phone")
    private String phone;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "email")
    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPasswordChanged() {
        return isPasswordChanged;
    }

    public void setPasswordChanged(boolean passwordChanged) {
        isPasswordChanged = passwordChanged;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
