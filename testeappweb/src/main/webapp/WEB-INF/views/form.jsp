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
    <h1>Cadastro de curso</h1>
	<form action="/testeappweb/confirma" method="post">
		<div>
			<label>Nome</label>
			<input type="text" name="nome">
		</div>
		<div>
			<label>Professor</label>
			<input type="text" name="professor">
		</div>
		<div>
			<label>Duração</label>
			<input type="text" name="duracao">
		</div>
		<div>
			<label>Tipo</label>
			<select name="tipo">
            	<option value="	PRESENCIAL">Presencial</option>
            	<option value="EAD">EAD</option>
        	</select>
        <br/><br/>
		</div>
		
		<c:forEach items="${materias}" var="tipoMateria" varStatus="s">
		<div>
			<label> ${tipoMateria}</label>
			<input type="text" name="materias[${s.index}].nomeMateria">
		</div>
		</c:forEach>
    	
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>