package com.tekreliance.utils;

import com.opensymphony.xwork2.ActionContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

import javax.servlet.http.HttpServletRequest;

/**
 * User: Jamshid Asatillayev
 * Date: 5/27/13
 * Time: 8:51 PM
 */
public class Utils {
    public static <T> T getSessionAttribute(String attr, Class<T> type) {
        return type.cast(getSession().get(attr));
    }

    public static <T> void setSessionAttribute(String key, T value) {
        getSession().put(key, value);
    }

    private static SessionMap<String,Object> getSession() {
        return (SessionMap<String,Object>) ActionContext.getContext().getSession();
    }
}
