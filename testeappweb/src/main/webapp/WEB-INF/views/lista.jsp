<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page isELIgnored="false" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teste App Web</title>
</head>
<body>
	<h1>Lista de cursos</h1>
    <table style="height: 10px; width: 775px;" border="1">
        <tr>
       		<th>Nome do curso</th>
        	<th>Professor</th>
        	<th>Duração em horas</th>
        	<th>Tipo</th>
        	<th>Matérias </th>
        	<th>Alunos</th>
        </tr>

        <c:forEach items="${cursos}" var="c">
        <tr>
            <td>${c.nome}</td>
            <td>${c.professor}</td>
            <td>${c.duracao}</td>
            <td>${c.tipo}</td>
            <td><a href="/testeappweb/listaMaterias">Lista matérias</a></td>
            <td><a href="/testeappweb/cadastrarAlunos">Cadastrar alunos</a></td>
        </tr>        
        </c:forEach>
    </table>
</body>
</html>