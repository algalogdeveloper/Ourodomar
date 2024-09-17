
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
        <div class="container-fluid">
            <section id="hero-animated" class=" hero-animated align-items-center">
                <h1>FORMULARIO DE CADASTRO</h1>

                <form action="controller?invoke=CadastrarAssociado" method="post" class="">
                    <caption>Dados Pessoais:</caption>
                    <div class="row">

                        <div class="col-md-8">
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="floatingInput" name="nome_associado" placeholder="name@example.com">
                                <label for="floatingInput">Nome completo do associado:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" name="apelido" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Apelido:</label>
                            </div>
                        </div>

                        <div class="col-md-2">
                            <div class="form-floating mb-2">
                                <input type="date" class="form-control" name="dtn" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Data Nascimento:</label>
                            </div>
                        </div>
                    </div>  

                    <div class="row">

                        <div class="col-md-2">
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                                <label for="floatingInput">RG:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                                <label for="floatingInput">CPF:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">CTPS/CT:</label>
                            </div>
                        </div>

                        <div class="col-md-3">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Titulo de Eleitor:</label>
                            </div>
                        </div>

                        <div class="col-md-3">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Estado Civil:</label>
                            </div>
                        </div>
                    </div>  
                    <caption>Dados do endereço do assegurado :</caption>
                    <div class="row">

                        <div class="col-md-2">
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                                <label for="floatingInput">Endereço do associado:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-floating mb-3">
                                <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com">
                                <label for="floatingInput">Bairro:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Municipio:</label>
                            </div>
                        </div>

                        <div class="col-md-3">
                            <div class="form-floating mb-2">
                                <input type="text" class="form-control" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Estado:</label>
                            </div>
                        </div>

                        <div class="col-md-3">
                            <div class="form-floating mb-2">
                                <input type="number" class="form-control" id="floatingPassword" placeholder="Password">
                                <label for="floatingPassword">Nº:</label>
                            </div>
                        </div>
                    </div>  
                    <div class="row">

                        <div class="col-md-6">
                            <div class="form-floating">
                                <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                                <label for="floatingTextarea">Ponto de referencia:</label>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-floating">
                                <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
                                <label for="floatingTextarea">Vizinhos mais proximos de referencia:</label>
                            </div>
                        </div>
                    </div>

                    <caption>Dados da associaçao :</caption>
                    <div class="row">
                        <div class="col-md-12 mb-1">
                            <div class="form-floating">
                                <select class="form-select" id="floatingSelect" aria-label="Floating label select example">
                                    <option selected>Ouro do mar</option>
                                    <option value="1">Z-27</option>
                                    <option value="2">Z-30</option>
                                    <option value="3">Z-40</option>
                                </select>
                                <label for="floatingSelect">Nome da associaçao:</label>
                            </div>
                        </div>
                    </div>
                    
                    
                    <div class="row ">

                        <div class="col-md-2">
                            <div class="form-floating mb-3">
                                <input type="number" class="form-control" id="floatingInput" placeholder="name@example.com">
                                <label for="floatingInput">Numero de filiaçao:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                            <div class="form-floating mb-3">
                                <input type="date" class="form-control" id="floatingInput" placeholder="name@example.com">
                                <label for="floatingInput">Data de filiaçao:</label>
                            </div>
                        </div>
                        <div class="col-md-2">
                             <div class="form-floating">
                                <select class="form-select" id="floatingSelect" aria-label="Floating label select example">
                                    <option selected>Pescador</option>
                                    <option value="1">Marisqueira</option>
                                   
                                </select>
                                <label for="floatingSelect">Profissao do associado:</label>
                            </div>
                        </div>

                        <div class="col-md-2">
                             <div class="form-floating">
                                <select class="form-select" id="floatingSelect" aria-label="Floating label select example">
                                    <option selected>Bahia pesca</option>
                                    <option value="1">Songoçalo</option>  
                                     <option value="1">Chinesa</option>  
                                </select>
                                <label for="floatingSelect">Nome da propriedade da atividade:</label>
                            </div>
                        </div>

                         <div class="col-md-2">
                             <div class="form-floating">
                                <select class="form-select" id="floatingSelect" aria-label="Floating label select example">
                                    <option selected>Artesalnal</option>
                                    <option value="1">Profissional</option>                                    
                                </select>
                                <label for="floatingSelect">Categoria do associado:</label>
                            </div>
                        </div>
                        
                        <div class="col-md-2">
                             <div class="form-floating">
                                <select class="form-select" id="floatingSelect" aria-label="Floating label select example">
                                    <option selected>Invidual</option>
                                    <option value="1">Familiar</option>                                    
                                </select>
                                <label for="floatingSelect">Regime de trabalho:</label>
                            </div>
                        </div>
                    </div> 
                    
                    <div class="btn-group " role="group" aria-label="Basic example">

                        <div class="text-center m-1"><button type="submit" class="btn btn-primary btn-block fw-bold">ENVIAR DADOS DO ASSOCIADO</button></div>
                        <div class="text-center m-1"><button type="submit" class="btn btn-light btn-block fw-bold">LIMPAR DADOS DO FORMULARIO</button></div>
                    </div>
                </form>

            </section>
        </div>
        <%@include file="../../../scripts.jsp" %>
    </body>
</html>
