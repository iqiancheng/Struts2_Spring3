package com.tekreliance.common;

import lombok.Data;

/**
 * User: Jamshid Asatillayev
 * Date: 5/24/13
 * Time: 11:38 AM
 */

@Data
public class MailObject {
    private String to;
    private String from;
    private String subject;
    private String template;
}
