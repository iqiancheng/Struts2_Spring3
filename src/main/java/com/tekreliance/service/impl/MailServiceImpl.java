package com.tekreliance.service.impl;

import com.tekreliance.common.MailObject;
import com.tekreliance.common.Props;
import com.tekreliance.domain.User;
import com.tekreliance.service.MailService;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * User: Jamshid Asatillayev
 * Date: 5/24/13
 * Time: 11:26 AM
 */
@Component
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    private Props props;
    @Autowired
    private VelocityEngine velocityEngine;


    @Override
    public void sendRegisterConfirmEmail(User user) {
        Map model = new HashMap();
        model.put("user", user);
        MailObject mailObject = new MailObject();
        mailObject.setFrom(props.fromAddress);
        mailObject.setTo(user.getEmail());
        mailObject.setSubject(props.subConfirmationEmail);
        mailObject.setTemplate("velocity/confirmation.vm");
        MimeMessagePreparator preparator = prepareMail(mailObject, model);
        mailSender.send(preparator);
    }


    public MimeMessagePreparator prepareMail(final MailObject mailObject, final Map model) {
        return new MimeMessagePreparator() {
            public void prepare(MimeMessage mimeMessage) throws Exception {
                MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
                message.setTo(mailObject.getTo());
                message.setFrom(mailObject.getFrom());
                message.setSubject(mailObject.getSubject());
                String text = VelocityEngineUtils.mergeTemplateIntoString(
                        velocityEngine, mailObject.getTemplate(), model);
                message.setText(text, true);
            }
        };
    }

}
