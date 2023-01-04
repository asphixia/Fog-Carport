<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>


    <jsp:attribute name="header">

    </jsp:attribute>


    <jsp:attribute name="footer">

    </jsp:attribute>

    <jsp:body>

        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <h2 class="card-header text-center" style="background: grey">Create your account here</h2>
                <div class="card-body" style="background: grey">
                   <div class="text-center">
                    <form action="createUser" method="post">
                        <label for="username">Create Username: </label><br>
                        <input type="text" id="username" name="username"><br>

                        <label for="password">Create password: </label><br>
                        <input type="password" id="password" name="password"/><br>

                        <label for="userrole">Enter Role: </label><br>
                        <input type="text" id="userrole" name="userrole"/><br>

                        <label for="name">Enter name: </label><br>
                        <input type="text" id="name" name="name"/><br>

                        <label for="adresse">Enter adresse: </label><br>
                        <input type="text" id="adresse" name="adresse"/><br>

                        <label for="email">Enter Email: </label><br>
                        <input type="text" id="email" name="email"/><br>

                        <label for="tlf">Enter tlf: </label><br>
                        <input type="number" id="tlf" name="tlf"/><br>
                        <br>
                        <button type="submit" class="btn btn-primary">CreatUser</button>
                    </form>
                   </div>
                </div>
            </div>
        </div>

    </jsp:body>
</t:pagetemplate>