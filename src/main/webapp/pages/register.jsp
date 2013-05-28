<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title></title>
    <link rel="stylesheet" href="/res/bootstrap/css/united.bootstrap.min.css"/>
    <link rel="stylesheet" href="/res/css/app.css"/>
    <link rel="stylesheet" href="/res/css/sticky.css"/>
    <script type="text/javascript" src="/res/js/jquery/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="/res/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript" src="/res/bootstrap/js/date.js"></script>
    <script type="text/javascript" src="/res/js/jquery/jquery.validate.min.js"></script>
    <script type="text/javascript" src="/res/js/jquery/additional-methods.min.js"></script>
    <script type="text/javascript" src="/res/js/jquery/jquery.validate.bootstrapfix.js"></script>
    <title></title>
</head>
<body>
  <script>
     $(document).ready(function(){
         $('#birthdate').datepicker();
     });
  </script>
<div class="span9 formb">
    <form class="form-horizontal" method="post" action="/register">
        <fieldset>
            <legend>Registration Page</legend>
            <div class="control-group">
                <label class="control-label" for="userName">Username</label>

                <div class="controls">
                    <input required="true" type="text" name="userName" placeholder="Username" id="userName"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputEmail">Email</label>

                <div class="controls">
                    <input required="true" type="email" name="email" placeholder="Email" id="inputEmail"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="inputPhone">Phone</label>

                <div class="controls">
                    <input required="true" type="phone" name="phone" placeholder="Phone" id="inputPhone"/>
                </div>
            </div>
            <div class="control-group">
                <label class="control-label" for="birthdate">Date of Birth</label>

                <div class="controls">
                    <input required="true" type="text" name="birthDate" placeholder="Date of Birth" id="birthdate"/>
                </div>
            </div>
            <div class="control-group">
                <div class="controls">

                    <button type="submit" class="btn">Register</button>
                </div>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>