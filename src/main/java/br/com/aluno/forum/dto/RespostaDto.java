package br.com.aluno.forum.dto;

import java.time.LocalDate;

import br.com.alura.forum.modelo.Resposta;

public class RespostaDto {

	private Long id;
	private String mensagem;
	private LocalDate dataCriacao;
	private String nomeAutor;

	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

}
