<%@tag description="Overall Page template" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

<!DOCTYPE html>
<html lang="da">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title><jsp:invoke fragment="header"/></title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<header>
    <nav class="navbar navbar-expand-lg navbar-light " style="background-color: dodgerblue">
        <div class="container">
            <a class="navbar-brand" href="index.jsp">
                <img src="${pageContext.request.contextPath}/images/Logo/Stor-Fog-logo.png" width="150px" class="img-fluid"/>
            </a>



            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
                    aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link" href="${pageContext.request.contextPath}/">Home</a>
                    <a class="nav-item nav-link" href="${pageContext.request.contextPath}/">Carport</a>
                    <a class="nav-item nav-link" href="${pageContext.request.contextPath}/">Quick-Byg</a>
                    <a class="nav-item nav-link" href="${pageContext.request.contextPath}/">CreatUser</a>
                    <c:if test="${sessionScope.user == null }">
                        <a class="nav-item nav-link" href="${pageContext.request.contextPath}/login.jsp">Login</a>
                    </c:if>
                    <c:if test="${sessionScope.user != null }">
                        <a class="nav-item nav-link" href="${pageContext.request.contextPath}/logout">Log out</a>
                    </c:if>
                    <a class="nav-item nav-link" href="${pageContext.request.contextPath}/login.jsp"><img src="${pageContext.request.contextPath}/images/Logo/Basket.png" width="50px" class="img-fluid"/></a>
                </div>
            </div>
        </div>
    </nav>
</header>

<div id="body" class="container mt-4" style="min-height: 400px;">
    <h1><jsp:invoke fragment="header"/></h1>
    <jsp:doBody/>
</div>

<!-- Footer -->
<div class="container mt-3">
    <hr/>
    <div class="row mt-4">
        <div class="col">
            <h4>Kundeservice</h4>
            <ul>

                <li>
                    <a href="https://www.johannesfog.dk/om-fog/forretninger/kontakt">Kontakt Fog</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/kundeservice/fortrydelse-og-returnering">Fortrydelse og returnering</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/kundeservice/fragt">Fragt</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/service/laan-en-trailer">Lån en trailer</a>
                </li>
                <li>
                    <a href="https://gavekort.johannesfog.dk/">Fog gavekort</a>
                </li>
            </ul>
        </div>
        <div class="col">
            <h4>Om Fog</h4>
            <ul>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/forretninger">Åbningstider</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/certificering">Byg bæredygtigt</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/job-i-fog">Karriere I Fog</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/betingelser-og-vilkaar/persondatapolitik">Persondatapolitik</a>
                </li>
            </ul>
        </div>
        <div class="col">
            <h4>Aktuelt</h4>
            <ul>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/aktuelt/aviser-og-kataloger">Aviser og kataloger</a>
                </li>
                <li>
                    <a href="https://www.johannesfog.dk/om-fog/nyhedsbrev">Tilmeld nyhedsbrev</a>
                </li>
                <li>
                    <a href="https://www.linkedin.com/company/johannes-fog-as/">LinkedIn</a>

                </li>
                <li>
                    <a href="https://www.instagram.com/fogboligdesignhus/">Instagram</a>
                </li>
                <li>
                    <a href="https://www.facebook.com/boligdesignhus">Facebook</a>
                </li>
            </ul>
        </div>
        <div class="col">
            <ul>
                <img src="${pageContext.request.contextPath}/images/Logo/Stor-Fog-logo.png" width="100px" class="img-fluid"/>

                <h4>Johannes Fog A/S</h4>
                <li>Firskovvej 20</li>
                <li>2800 Lyngby</li>
                <li>CVR-nr. 16314439</li>
            </ul>
        </div>
    </div>

</div>

<!-- Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>

</body>
</html>