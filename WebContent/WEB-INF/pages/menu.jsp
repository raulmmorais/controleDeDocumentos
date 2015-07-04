<%@taglib uri="/struts-tags" prefix="s"%>
    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="home">Home</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Documento<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="novoDocumento">Novo Documento</a>
                            </li>
                            <li>
                                <a href="abrirDocumento">Abrir Documento</a>
                            </li>
                            <li>
                                <a href="renomearDocumento">Renomear Documento</a>
                            </li>
                            <li role="separator" class="divider"></li>
                            <li>
                                <a href="documentosDigitalizados">Documentos Digitalizados</a>
                            </li>
                            <li role="separator" class="divider"></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Tipos de Documentos<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                        	<li>
                        		<a href="tiposDeDocumento">Todos os Tipos</a>
                        	</li>
                        	<li>
                        		<a href="novoTipoDeDocumento">Novo</a>
                        	</li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Autor<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="novoAutor">Novo Autor</a>
                            </li>
                            <li>
                                <a href="listaAutores">Todos os Autores</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Natureza<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="novaNatureza">Nova</a>
                            </li>
                            <li>
                                <a href="listaNatureza">Todos</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="arquivo">Arquivo</a>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Origem/Destino<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="novaOrigemDestino">Novo</a>
                            </li>
                            <li>
                                <a href="listaOrigemDestino">Todos</a>
                            </li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Contrato<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <a href="novoContrato">Novo Contrato</a>
                            </li>
                            <li>
                                <a href="listaContratos">Lista de Contratos</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="sobre">Sobre</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>