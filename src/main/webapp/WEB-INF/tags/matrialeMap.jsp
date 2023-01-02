<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="/error.jsp" isErrorPage="false" %>

<t:pagetemplate>

    <jsp:body>
        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <h2 class="card-header text-center" style="background-color: dodgerblue">Materialer</h2>
                <div class="card-body" style="background-color: #04AA6D">
                        <div class="text-center">
                            <div class="form-group">
                                <h3>StykListe</h3>

                                <c:forEach var="item" items="${applicationScope.materialerMap}">
                                    <br>
                                    Nr: ${item.key} Navn: ${item.value.name} Enhed: ${item.value.unit} Price: ${item.value.price_per_unit}
                                    <br>
                                </c:forEach>
                                <br>

                                Carport Bredde på : ${sessionScope.cart.lastCarport.width} meter
                                <br>
                                Carport Længde på : ${sessionScope.cart.lastCarport.lenghte} meter
                                <br>
                                Redskabsrum bredde på : ${sessionScope.cart.lastCarport.r_width} meter
                                <br>
                                Redskabsrum Længde på : ${sessionScope.cart.lastCarport.r_lenght} meter

                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>


    </jsp:body>

</t:pagetemplate>
