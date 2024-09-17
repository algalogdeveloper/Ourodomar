

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <%@include file="face.jsp" %>
    <body>

        <section id="hero-animated" class="hero-animated d-flex align-items-center">
            <main class="container">
                
                <c:if test="${not empty erro}">
                    <div class="alert alert-danger fw-bold"><i class="bi bi-bug"></i> ${erro}</div>
                </c:if>
                    <h1>Login do Usuario</h1>
                    <hr>
                <div class="row">
                    <div class="col-md-4">
                        <form action="authenticar" method="post">
                            <div class="mb-3 mt-3">
                                <label for="email" class="form-label fw-bold">Login:</label>
                                <input type="text" class="form-control" id="email" placeholder="Enter email" name="email">
                            </div>
                            <div class="mb-3">
                                <label for="pwd" class="form-label fw-bold">Senha:</label>
                                <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
                            </div>
                            <div class="form-check mb-3 fw-bold">
                                <label class="form-check-label">
                                    <input class=" form-check-input" type="checkbox" name="remember"> Lembrar de mim                            </label>
                            </div>
                            <button type="submit" class="btn btn-primary fw-bold">Logar</button>
                        </form>
                    </div>
                    
                </div>

            </main>
        </section>


        <%@include file="scripts.jsp" %>
    </body>

</html>
