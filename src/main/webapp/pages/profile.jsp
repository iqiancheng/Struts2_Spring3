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
    <form method="post" class="form-horizontal" action="/changePassword">
        <fieldset>
            <legend>Profile Page</legend>
            <s:if test="#{user.isPasswordChanged==false}">
                <div class="alert">
                    <button type="button" class="close" data-dismiss="alert">×</button>
                    <strong>Warning!</strong> Please change the auto-generated password.
                </div>
            </s:if>
            <div class="control-group">
                <label class="control-label" for="inputEmail">User Name</label>

                <div class="controls">
                    <s:textfield  placeholder="User Name" required="true" name="user.userName"  id="inputEmail" />
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPassword">Current Password</label>

                <div class="controls">
                    <s:password required="true" name="oldPassword" id="inputPassword" placeholder="Current Password"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputnewPassword">New Password</label>

                <div class="controls">
                    <s:password required="true" name="newPassword" id="inputnewPassword" placeholder="New Password" />
                </div>
            </div>
            <div class="control-group">
                <div class="controls">

                    <button type="submit" class="btn">Save</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>

</body>
</html>