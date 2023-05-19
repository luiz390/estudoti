package com.treinamento.estudo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento.estudo.dto.EstudantesDTO;
import com.treinamento.estudo.entity.Estudantes;
import com.treinamento.estudo.repositorys.EstudantesRepository;

@Service
public class EstudantesService {
	
	@Autowired
	private EstudantesRepository estr;
	
	public List<EstudantesDTO> findAll(){
		List<Estudantes> rest = estr.findAll();
		return rest.stream().map(x -> new EstudantesDTO(x)).toList();
	}

}
