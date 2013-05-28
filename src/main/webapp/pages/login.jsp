<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="/res/bootstrap/css/united.bootstrap.min.css"/>
    <link rel="stylesheet" href="/res/css/app.css"/>
    <link rel="stylesheet" href="/res/css/sticky.css"/>
    <script type="text/javascript" src="/res/js/jquery/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="/res/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/res/js/jquery/jquery.validate.min.js"></script>
    <script type="text/javascript" src="/res/js/jquery/additional-methods.min.js"></script>
    <script type="text/javascript" src="/res/js/jquery/jquery.validate.bootstrapfix.js"></script>
    <title></title>
</head>
<body>

<div class="span9 formb">
    <form class="form-horizontal" method="post" action="/login">
        <fieldset>
            <legend>User Login Page</legend>
            <s:if test="#{wrongLogin==true}">
                <div class="alert alert-error">
                    <button type="button" class="close" data-dismiss="alert">×</button>
                    You entered wrong password or email!
                </div>
            </s:if>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>

                <div class="controls">
                    <input type="text" name="email" placeholder="Email" id="inputEmail"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Password</label>

                <div class="controls">
                    <input type="password" name="password" id="inputPassword" placeholder="Password">
                </div>
            </div>
            <div class="control-group">
                <div class="controls">

                    <button type="submit" class="btn">Sign in</button>
                    <a href="/registerPage">Register</a>
                </div>
            </div>
        </fieldset>
    </form>
</div>

</body>
</html>