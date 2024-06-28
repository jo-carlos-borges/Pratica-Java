package banana.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import banana.dao.ProdutoDao;
@Entity
public class Produto {

	@Id
	private int idProduto;
	private String nomeProduto;
	private String descricao;
	private int quantidade;
	private double preco;
	private boolean online;
	
	public Produto() {
		
	}
	
	public Produto(String nomeProduto ,String descricao, int quantidade, double preco, boolean online) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.online = online;
	}

	public Produto(int idProduto, String nomeProduto, String descricao, int quantidade, double preco, boolean online) {
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
		this.online = online;	
	}
	
	public int getIdProduto() {
		return this.idProduto;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public String getnomeProduto() {
		return nomeProduto;
	}

	public void setnomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
	
	public void salvar() {
		new ProdutoDao().cadastro(this);
	}
	
}
