<nav id="navbar" class="navbar navbar-dark">
    <ul>
        <li class="dropdown"><a href="#"><span>Cadastros</span> <i class="bi bi-chevron-down dropdown-indicator"></i></a>
            <ul>
                <li><a href="controller?invoke=FormAssociado">Associado</a></li>                
                <li><a href="controller?invoke=FormAssociacao">Associaçao</a></li>
                <li><a href="controller?invoke=FormFuncionario">Funcionario</a></li>
                <li><a href="controller?invoke=FormProfissao">Profissao</a></li>
                 <li><a href="controller?invoke=FormCategoria">Categoria</a></li>
                 <li><a href="controller?invoke=FormProprietarios">Proprietarios rurais</a></li>
            </ul>
        </li>

        <li class="dropdown megamenu"><a href="#"><span>Consultas</span> <i class="bi bi-chevron-down dropdown-indicator"></i></a>
            <ul>
                <li>
                    <a href="controller?invoke=TodosAssociados">Todos associados</a>
                    <a href="controller?invoke=TodosAssociados">Todas associaçao</a>
                    <a href="controller?invoke=TodasProfissao">Todas os Profissao</a>
                </li>
                <li>
                    <a href="controller?invoke=TodasCategorias">Todas categorias</a>
                    <a href="controller?invoke=TodosFuncionarios">Todos funcionarios</a>
                    <a href="controller?invoke=TodosProprietarios">Proprietarios rurais</a>
                </li>
                <li>
                    <a href="#">Column 3 link 1</a>
                    <a href="#">Column 3 link 2</a>
                    <a href="#">Column 3 link 3</a>
                </li>
                <li>
                    <a href="#">Column 4 link 1</a>
                    <a href="#">Column 4 link 2</a>
                    <a href="#">Column 4 link 3</a>
                </li>
            </ul>
        </li>
        <li class="dropdown"><a href="controller?invoke=Logout"><span>Usuario: ${sessionmap.login}</span> <i class="bi bi-chevron-down dropdown-indicator"></i></a>
            <ul>
                <li><a href="controller?invoke=Logout"><i class="bi bi-calendar-date"></i> ${sessionmap.dataacesso}</a></li>
                <li><a href="controller?invoke=Logout"><i class="bi bi-clock"></i>Logout</a></li>
            </ul>
        </li>
       
        <li><a class="nav-link scrollto" href="index.html#contact">Contact</a></li>
    </ul>
    <i class="bi bi-list mobile-nav-toggle d-none"></i>
</nav>