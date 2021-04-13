<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>

<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Successful Login</title>
</head>

<style type="text/css">
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
 <div style="text-align: center">
  <h1>Welcome <s:property value="account.username"/>!</h1>
   <s:form action="logout">
    <s:submit value="Logout" />
   </s:form>
  </div>
</body>
</html>