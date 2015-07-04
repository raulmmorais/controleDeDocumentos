<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="App para controle de documentos">
    <meta name="author" content="Raul de Melo Morais">

    <title><tiles:insertAttribute name="title" /></title>
    <!-- Bootstrap Core CSS -->
	<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.css">
	<!-- Custom CSS -->
    <link rel="stylesheet" type="text/css" href="resources/css/controle-de-contas.css">
    <!-- Custom Fonts -->
    <link rel="stylesheet" type="text/css" href="resources/font-awesome/css/font-awesome.min.css">	
</head>
<body>
	<div class="container">
		<tiles:insertAttribute name="menu" />
	</div>
	<div class="container">
		<tiles:insertAttribute name="body" />
	</div>
	<script type="text/javascript" src="resources/js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="resources/js/home.js"></script>
</body>
</html>