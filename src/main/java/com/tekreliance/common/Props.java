package com.tekreliance.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Loaded from the property files
 *
 *
 * @created: 4/14/12 3:07 PM
 *
 */
public class Props {

    public
    @Value("#{mailProps['mail.fromAddress']}")
    String fromAddress;
    public
    @Value("#{mailProps['mail.sub.verificationEmail']}")
    String subVerificationEmail;
    public
    @Value("#{mailProps['mail.sub.confirmationEmail']}")
    String subConfirmationEmail;
    public
    @Value("#{mailProps['mail.verifyUrl']}")
    String verifyUrl;

    public List<String> webAuthRoutes;
    public List<String> apiAuthRoutes;


    @PostConstruct
    public void init() {

    }
}
