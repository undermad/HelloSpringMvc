<%--
  Created by IntelliJ IDEA.
  User: Dominik
  Date: 24.12.2022
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
Student Confirmed: ${student.firstName} ${student.lastName}
<br>
Origin Country: ${student.country}
<br>
Favourite Language: ${student.favouriteLanguage}
<br>
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>
