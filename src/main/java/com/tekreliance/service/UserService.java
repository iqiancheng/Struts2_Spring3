package com.tekreliance.service;

import com.tekreliance.domain.User;
import org.springframework.stereotype.Service;

/**
 * User: Jamshid Asatillayev
 * Date: 5/23/13
 * Time: 12:13 PM
 */
public interface UserService {
    void saveUser(User user);

    User findUser(String email, String password);
}
