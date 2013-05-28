package com.tekreliance.service;

import com.tekreliance.domain.User;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * User: Jamshid Asatillayev
 * Date: 5/24/13
 * Time: 11:26 AM
 */
public interface MailService {
    void sendRegisterConfirmEmail(User user);
}
