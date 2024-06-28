<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="css/bananaStyle.css">

<meta charset="ISO-8859-1">
<title>Consulta Java</title>
</head>
<body>
	
	<nav class="bananaNav">
		<ul>
			<li><span style="color: red">Pratica Java</span></li>
			<li><img src="" height="20px"></li>
			<li><a href="cadastro.jsp">Cadastrar</a></li>
			<li><a href="consulta.jsp">Consulta</a></li>
		</ul>
	</nav>
	
	<main class="bananaMain">
		<form action="cadastro" method="post" class="bananaForm">
			
			<div>
				<label><strong>Nome Produto:</strong></label>
				<input type="text" name="nomeProduto">
			</div>
			
			<div>
				<label><strong>Descrição:</strong></label>
				<input type="text" name="descricao">
			</div>
			
			<div>
				<label><strong>Quantidade:</strong></label>
				<input type="text" name="quantidade">
			</div>
			
			<div>
				<label><strong>Preço:</strong></label>
				<input type="text" name="preco">
			</div>
			
			<label><strong>Disponiveis</strong></label>
				<input type="checkbox" name="online">
			
			<br>
			
			<div>
				<input id="bananaButton" type="submit" name="salvar" value="Cadastrar Produto">
			</div>
			
			<br>
			
			<div>
				<%
				String mensagem = (String) request.getAttribute("mensagem");
				if (mensagem != null)
					out.print(mensagem);
				%>
			</div>
			
		</form>
	</main>
</body>
</html>