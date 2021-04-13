<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
 <head>
  <meta charset="UTF-8">
  <title>Login Page</title>
 </head>

 <style type="text/css">
  .errorMessage {
   font-weight: bold;
   color: darkred;
   list-style: none;
   padding: 0;
  }
  html, body {
   height: 100%;
  }
  html {
   display: table;
   margin: auto;
  }
  body {
   display: table-cell;
   vertical-align: middle;
  }
 </style>
 
<body bgColor="lightBlue">
    <h1>Login Page</h1>
   <s:form action="loginprocess" method="post" theme="css_xhtml">
    <s:textfield name="account.username" label="Username" type="text" 
                 value="" size = "30"/>
    <s:textfield name="account.password" label="Password" type="password"
                 value="" size = "30"/>
    <s:submit value="Login"/>
  </s:form>
 </div>
</body>
</html>