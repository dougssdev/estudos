package br.com.douglas.mudi.mudi.dto;

import br.com.douglas.mudi.mudi.model.Pedido;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public class RequisicaoPedido {
	
	@NotBlank
	private String nomeProduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagem;
	
	private String descricao;

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getUrlProduto() {
		return urlProduto;
	}

	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Pedido toPedido() {
		Pedido p = new Pedido();
		p.setDescricao(descricao);
		p.setNomeProduto(nomeProduto);
		p.setUrlImagem(urlImagem);
		p.setUrlProduto(urlProduto);
		
		return p;
	}
	
}
