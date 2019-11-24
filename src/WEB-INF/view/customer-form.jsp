<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Sam
  Date: 10/11/2019
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">
    First Name: <form:input path="firstName"/> <br><br>
    Last Name (*): <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error" /><br><br>
    Free Passes (*): <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error" /> <br><br>
    Postcode : <form:input path="postcode"/>
    <form:errors path="postcode" cssClass="error" /> <br><br>
    Course Code : <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="error" /> <br><br>
    <input type="submit" value="Submit" />

</form:form>

</body>
</html>
