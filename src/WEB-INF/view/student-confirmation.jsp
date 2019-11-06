<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 05/11/2019
  Time: 17:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student Confirmation</title>


</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}

<br><br>

Favourite language is  ${student.favouriteLanguage}

<br><br>

Their operating systems are:

<ul>
    <c:forEach var="system" items="${student.operatingSystems}">
        <li>${system}</li>
    </c:forEach>

</ul>


</body>
</html>
