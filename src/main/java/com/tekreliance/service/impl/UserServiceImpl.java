package com.tekreliance.service.impl;

import com.tekreliance.domain.User;
import com.tekreliance.repository.UserRepository;
import com.tekreliance.service.MailService;
import com.tekreliance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * User: Jamshid Asatillayev
 * Date: 5/23/13
 * Time: 12:13 PM
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MailService mailSenderActor;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
        if (!user.isPasswordChanged()) {
            mailSenderActor.sendRegisterConfirmEmail(user);
        }
    }

    @Override
    public User findUser(String email, String password) {
        return userRepository.findOneByEmailAndPassword(email,password);
    }

}
