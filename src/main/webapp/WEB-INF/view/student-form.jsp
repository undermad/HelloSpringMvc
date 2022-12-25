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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<body>
<div class="container">
    <div class="test">
            <form:form class="form" action="processForm" modelAttribute="student">
                <form:input class="input" path="firstName"></form:input>
                <br>
                <form:input class="input" path="lastName"></form:input></span>
                <br>
                <p><form:select path="country">
                    <form:options items="${countriesProperties}"/>
                </form:select></p>
                <br>
                <span><form:radiobuttons path="favouriteLanguage" items="${favouriteLanguages}"/></span>
                <br>
                <span><form:checkboxes path="operatingSystems" items="${operatingSystems}"/></span>
                <br>
                <span><input type="submit" value="Process"></span>
                <br>
            </form:form>
    </div>
</div>

</body>
</html>
