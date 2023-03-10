<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 25.12.2022
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>
<form:form modelAttribute="customer" action="processForm">
    <span>Name*: </span><form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    <br>
    <span>Last name: </span><form:input path="lastName"/>
    <br>
    <br>
    <span>Age: </span><form:input path="age"/>
    <form:errors path="age" cssClass="error"/>
    <br>
    <br>
    <span>Post Code: <form:input path="postCode"/></span>
    <form:errors path="postCode" cssClass="error"/>
    <br>
    <br>
    Course Code: <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error"/>
    <br>
    <br>
    <input type="submit" value="Submit">

</form:form>

</body>
</html>
