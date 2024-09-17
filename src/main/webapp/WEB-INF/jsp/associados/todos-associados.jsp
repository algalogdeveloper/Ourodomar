

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../../face.jsp" %>
    <body>
        <header id="header"  class="header fixed-top bg-light" data-scrollto-offset="0">
            <div class="container-fluid d-flex  align-items-center justify-content-between">
                <%@include file="../../../nav.jsp" %>
            </div>
        </header> 
        <section id="hero-animated" class="hero-animated align-items-center">

            <h1>Todos associados!</h1> 
            <strong>  ${model.message} </strong>
            <div class="table-responsive">
                <table class="table table-striped table-hover" id="dataTable">
                    <thead>
                    <th>Id</th>
                    <th>Nome</th>
                    <th>Sexo</th>
                    <th>Data Nascimento</th>
                    <th>Data de Filiaçao</th>
                    </thead>
                </table>
            </div>
            <c:forEach var="a" items="${model.associados}">
                <strong>${a.nome}</strong>
                <strong>${a.email}</strong>
            </c:forEach>
        </section>
            
            
        <%@include file="../../../scripts.jsp" %>
    </body>
</html>
