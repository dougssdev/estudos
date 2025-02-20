package br.com.getbank.modelo;

import java.io.Serializable;

/**
 * Dá as características ao cliente.
 * @author Douglas
 *
 */

public class Cliente implements Serializable{
	String nome;
	String cpf;
	String profissao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}

