package com.treinamento.estudo.dto;

import com.treinamento.estudo.entity.Estudantes;

public class EstudantesDTO {
	
	private Long id;
	private String nome;
	private String telefone;
	private String cpf;
	private Double cep;
	
	public EstudantesDTO() {
		
	}

	public EstudantesDTO(Estudantes Entity) {
        id = Entity.getId();
		nome = Entity.getNome();
		telefone = Entity.getTelefone();
		cpf = Entity.getCpf();
		cep = Entity.getCep();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getCep() {
		return cep;
	}
	
	

}
