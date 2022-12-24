<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 24.12.2022
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
    First Name: <form:input path="firstName"></form:input>
    <br>
    Last Name: <form:input path="lastName"></form:input>
    <br>
    <form:select path="country">
        <form:options items="${countriesProperties}"/>
    </form:select>
    <br>
    <form:radiobuttons path="favouriteLanguage" items="${favouriteLanguages}"/>
    <br>
    <form:checkboxes path="operatingSystems" items="${operatingSystems}"/>
    <br>
    <input type="submit" value="Process">
    <br>
</form:form>

</body>
</html>
