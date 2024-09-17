

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../face.jsp" %>
    <body>
        <div class="container-sm">

            <section id="hero-animated" class="hero-animated d-flex align-items-center">
                
                <main class="container-fluid">
                    
                    <c:choose>
                        <c:when test="${ not empty erro}">
                            <div class="alert alert-danger fw-bold"><i class="bi bi-bug"></i> ${erro}</div>
                        </c:when>
                        <c:when test="${not empty message}">
                            <div class="alert alert-success fw-bold"><i class="bi bi-check"></i> ${message}</div>
                        </c:when>
                    </c:choose>
                    <h1>Logar Usuario</h1>
                    <hr>
                    <div class="row">
                        <div class="col-md-4">
                            <form action="authenticar" method="post">
                                <div class="mb-3 mt-3">
                                    <label for="email" class="form-label">Email:</label>
                                    <input type="text" class="form-control" id="email" placeholder="Enter email" name="email">
                                </div>
                                <div class="mb-3">
                                    <label for="pwd" class="form-label">Password:</label>
                                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
                                </div>
                                <div class="form-check mb-3">
                                    <label class="form-check-label">
                                        <input class="form-check-input" type="checkbox" name="remember"> Remember me
                                    </label>
                                </div>
                                <button type="submit" class="fw-bold btn btn-primary">Logar</button>
                            </form>
                        </div>
                        
                    </div>

                </main>
            </section>
        </div>
        <%@include file="../../scripts.jsp" %>
    </body>
</html>
