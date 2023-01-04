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
                            <br>
                            Navn : ${sessionScope.stolpe}, Antal : ${sessionScope.stolpeAntal}
                            <br>
                            Navn : ${sessionScope.spær}, Antal : ${sessionScope.spærAntal}
                            <br>
                            Navn : ${sessionScope.remAntal}, Antal : ${sessionScope.FBRemAntal}
                            <br>
                            Navn : ${sessionScope.sRemAntal}, Antal : ${sessionScope.SideRemAntal}
                            <br>
                            Navn : ${sessionScope.tagRemAntal}, Antal : ${sessionScope.RemPåTageAntal}
                            <br>
                            Navn : ${sessionScope.pladeAntal}, Antal : ${sessionScope.tagpladeAntal}
                            <br>
                            Navn : ${sessionScope.pakkeAntal}, Antal : ${sessionScope.tagpladeSkruerPakkeAntal}
                            <br>
                            Navn : ${sessionScope.hulband}, Antal : ${sessionScope.antalHulband}
                            <br>
                            Navn : ${sessionScope.skruer}, Antal : ${sessionScope.SternOgVandbredSkruer}
                            <br>
                            Navn : ${sessionScope.beslag}, Antal : ${sessionScope.SkruerTilUniverSalBeslag}
                            <br>
                            Navn : ${sessionScope.bolt}, Antal : ${sessionScope.BraeddeBolt}
                            <br>
                            Navn : ${sessionScope.skiver}, Antal : ${sessionScope.FirkantSkiver}

                            <br>
                            <br>

                            Carport Bredde på : ${sessionScope.cart.lastCarport.width} cm
                            <br>
                            Carport Længde på : ${sessionScope.cart.lastCarport.lenghte} cm
                            <br>
                            Redskabsrum bredde på : ${sessionScope.cart.lastCarport.r_width} cm
                            <br>
                            Redskabsrum Længde på : ${sessionScope.cart.lastCarport.r_lenght} cm

                        </div>
                    </div>
                    </form>
                </div>
            </div>
        </div>



    </jsp:body>

</t:pagetemplate>
