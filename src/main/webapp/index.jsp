<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error.jsp" isErrorPage="false" %>

<t:pagetemplate>
    <jsp:attribute name="header">
         Welcome to the frontpage
    </jsp:attribute>

    <jsp:attribute name="footer">
        Welcome to the frontpage
    </jsp:attribute>

    <jsp:body>

        <div class="container">
            <div class="card w-50 mx-auto my-5">
                <div class="card-header text-center">Register formulare</div>
                <div class="card-body text-center">
                    <form action="Basket" method="post">
                        <div class="form-group1">
                            <h5>Carport bredde</h5>
                           <select>
                               <option>....................Vælge bredde til dit carport....................</option>
                               <option value="1">240 cm</option>
                               <option value="2">270 cm</option>
                               <option value="3">300 cm</option>
                               <option value="4">330 cm</option>
                               <option value="5">360 cm</option>
                               <option value="6">390 cm</option>
                               <option value="7">420 cm</option>
                               <option value="8">450 cm</option>
                               <option value="9">480 cm</option>
                               <option value="10">510 cm</option>
                               <option value="11">540 cm</option>
                               <option value="12">570 cm</option>
                               <option value="13">600 cm</option>
                               <option value="14">630 cm</option>
                               <option value="15">660 cm</option>
                           </select>
                        </div>
                        <br>

                        <div class="form-group2">

                            <h5>Carport Længde</h5>

                            <select>
                                <option>....................Vælge Længde til dit carport....................</option>
                                <option value="1">240 cm</option>
                                <option value="2">270 cm</option>
                                <option value="3">300 cm</option>
                                <option value="4">330 cm</option>
                                <option value="5">360 cm</option>
                                <option value="6">390 cm</option>
                                <option value="7">420 cm</option>
                                <option value="8">450 cm</option>
                                <option value="9">480 cm</option>
                                <option value="10">510 cm</option>
                                <option value="11">540 cm</option>
                                <option value="12">570 cm</option>
                                <option value="13">600 cm</option>
                                <option value="14">630 cm</option>
                                <option value="15">660 cm</option>
                                <option value="16">690 cm</option>
                                <option value="17">720 cm</option>
                                <option value="18">750 cm</option>
                                <option value="19">780 cm</option>
                            </select>
                        </div>
                        <br>
                        <div class="form-group3">
                            <h5>Carport trapeztag</h5>

                            <select>
                                <option>....................Uden tagplader....................</option>
                                <option>....................Plasttrapezplader....................</option>
                            </select>
                        </div>

                        <br>

                        <h5>Redskabsrum</h5>
                        <label> NB!Der skal beregnes 15 cm tagudhæng på hver side af redskabsrummet</label>
                        <br>
                        <br>

                        <div class="form-group4">
                            <h5>Redskabsrum bredde</h5>
                            <select>
                                <option>....................Uden redskabsrum.....................</option>
                                <option value="0">210 cm</option>
                                <option value="1">240 cm</option>
                                <option value="2">270 cm</option>
                                <option value="3">300 cm</option>
                                <option value="4">330 cm</option>
                                <option value="5">360 cm</option>
                                <option value="6">390 cm</option>
                                <option value="7">420 cm</option>
                                <option value="8">450 cm</option>
                                <option value="9">480 cm</option>
                                <option value="10">510 cm</option>
                                <option value="11">540 cm</option>
                                <option value="12">570 cm</option>
                                <option value="13">600 cm</option>
                                <option value="14">630 cm</option>
                                <option value="15">660 cm</option>
                                <option value="16">690 cm</option>
                                <option value="17">720 cm</option>
                            </select>
                        </div>
                        <br>
                        <div class="form-group5">
                            <h5>Redskabsrum længde</h5>
                            <select>
                                <option>....................Uden redskabsrum.....................</option>
                                <option value="1">150 cm</option>
                                <option value="2">180 cm</option>
                                <option value="3">210 cm</option>
                                <option value="4">240 cm</option>
                                <option value="5">270 cm</option>
                                <option value="6">300 cm</option>
                                <option value="7">330 cm</option>
                                <option value="8">360 cm</option>
                                <option value="9">390 cm</option>
                                <option value="10">420 cm</option>
                                <option value="11">450 cm</option>
                                <option value="12">480 cm</option>
                                <option value="13">510 cm</option>
                                <option value="14">540 cm</option>
                                <option value="15">570 cm</option>
                                <option value="16">600 cm</option>
                                <option value="17">630 cm</option>
                                <option value="18">660 cm</option>
                            </select>
                        </div>
                        <br>
                        <h5>Evt. bemærkning / særlige ønsker</h5>

                        <textarea> </textarea>

                        <br>
                        <br>

                        <form>
                            <label for="fname">First name:</label>
                            <input type="text" id="fname" name="fname" value="Firstname" placeholder="Firstname">
                            <label for="lname">Last name:</label>
                            <input type="text" id="lname" name="lname" value="Lastname" placeholder="Lastname"><br><br>
                            <label for="adresse">Adresse:</label>
                            <input type="text" id="adresse" name="adresse" value="Adresse" placeholder="Adresse">
                            <label for="postcode">Postcode:</label>
                            <input type="number" id="postcode" name="postcode" value="Postcode" placeholder="Postcode"><br><br>
                            <label for="city">City:</label>
                            <input type="text" id="city" name="city" value="City" placeholder="City">
                            <label for="phone">Phone:</label>
                            <input type="number" id="phone" name="phone" value="Phone" placeholder="Phone"><br><br>
                            <label for="email">Email:</label>
                            <input type="email" id="email" name="email" value="Email" placeholder="Email">

                        </form>

                        <br>
                        <br>

                        <form>
                            <h5>Kontakt samtykke</h5>
                            <input type="radio" id="Fog" name="fav_language" value="">
                            <label for="Fog">Fog må benytte de afgivne oplysninger til at kontakte mig</label><br>
                            <label for="fog">i forbindelse med tilbud på QuickByg carport*</label>
                        </form>
                        <br>
                        <br>



                        <div class="text-center">
                            <button type="submit" class="btn btn-primary">Bestil tilbud</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </jsp:body>

</t:pagetemplate>