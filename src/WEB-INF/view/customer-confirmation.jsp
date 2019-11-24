<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title>Customer Confirmation of data</title>
</head>
<body>
<p>Customer confirmed as ${customer.firstName} ${customer.lastName}</p>
<p>Address: ${customer.postcode}</p>
<p>Customer has ${customer.freePasses} free passes</p>
<p>Customer has enrolled on the course: ${customer.courseCode}</p>

</body>
</html>
