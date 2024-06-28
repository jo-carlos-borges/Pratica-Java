package banana.controller;

import java.io.IOException;

import banana.HCFTeste;
import banana.model.Produto;
import br.com.hcf.HCFFactory;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastrarProdutoController
 */
public class cadastrarProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cadastrarProdutoController() {
    	super();
    	new HCFTeste().iniciar();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UFT-8");
		
		System.out.println("CHEGOU AQUI");
		
		String nomeProduto = request.getParameter("nomeProduto");
		String descricao = request.getParameter("descricao");
		
		String mensagem;
		
		
		
		RequestDispatcher dispatchec = request.getRequestDispatcher("cadastro.jsp");
		if (nomeProduto != null && !nomeProduto.isEmpty() && descricao != null && !descricao.isEmpty() && request.getParameter("quantidade") != null
				&& !request.getParameter("quantidade").isEmpty() && request.getParameter("preco") != null
				&& !request.getParameter("preco").isEmpty()) {
			
			int quantidade;
			double preco;
			quantidade =  Integer.parseInt(request.getParameter("quantidade"));
			preco = Double.parseDouble(request.getParameter("preco"));
			
			boolean online = false;
			if (request.getParameter("online") != null && request.getParameter("online").equals("on"))
				online = true;
			
			Produto produto = new Produto(nomeProduto, descricao, quantidade, preco, online);
			produto.salvar();
			
			mensagem = "Produto Cadastrado com sucesso!";

		} else 
			mensagem = "Os campos precisam ser preenchidos!";
		request.setAttribute("mensagem", mensagem);
		dispatchec.forward(request, response);
	}
}
	
