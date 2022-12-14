<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
             Create Account
    </jsp:attribute>

    <jsp:attribute name="footer">

    </jsp:attribute>

    <jsp:body>
        <h4>You can create your account here</h4>

        <form action="createUser" method="post">
            <label for="username">Create Username: </label><br>
            <input type="text" id="username" name="username"><br>
            <label for="password">Create password: </label><br>
            <input type="text" id="password" name="password"/><br>
            <label for="userrole">Enter Role: </label><br>
        h    <input type="userrole" id="userrole" name="userrole"/><br>
            <label for="balance">Insert Balance: </label><br>
            <input type="number" id="balance" name="balance"/><br>
            <input type="submit" value="CreateUser"/><br>
        </form>

    </jsp:body>
</t:pagetemplate>