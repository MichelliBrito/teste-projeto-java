<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teste App Web</title>
</head>
<body>
    <h1>Cadastro de materias</h1>
	<form action="/testeappweb/cadastrarMaterias" method="post">
		<div>
			<label>Nome Materia</label>
			<input type="text" name="nomeMateria">
		</div>
		<button type="submit">Cadastrar</button>
	</form>
	
	<div>
		<label><a href="/testeappweb/listaCursos">Finalizar</a></label>
	</div>
</body>
</html>