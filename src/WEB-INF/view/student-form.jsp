<%@ taglib prefix="form" uri = "http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Student form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First name: <form:input path="firstName"/>
        <br><br>
        Last name (*): <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>

        <br><br>

        Country: <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>

        <br><br>

        Java <form:radiobutton path="favouriteLanguage" value="Java" />
        C# <form:radiobutton path="favouriteLanguage" value="C#" />
        C++ <form:radiobutton path="favouriteLanguage" value="C++" />
        Python <form:radiobutton path="favouriteLanguage" value="Python" />


        <br><br>

        Linux <form:checkbox path="operatingSystems" value="Linux" />
        Windows <form:checkbox path="operatingSystems" value="Windows" />
        Mac <form:checkbox path="operatingSystems" value="Mac" />
        TempleOS <form:checkbox path="operatingSystems" value="TempleOS" />

        <br><br>

        <input type="submit" value="Submit"/>

    </form:form>

</body>
</html>