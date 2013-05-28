<%--
  Created by IntelliJ IDEA.
  User: devpro
  Date: 5/23/13
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World</title>
    </head>
    <body>
        <s:form action="saveUser" >
            <s:textfield name="userName" label="User Name" />
            <s:submit />
        </s:form>
    </body>
</html>