package com.treinamento.estudo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.estudo.dto.EstudantesDTO;
import com.treinamento.estudo.service.EstudantesService;

@RestController
@RequestMapping(value = "/estudantes")
public class EstudantesController {
	
	@Autowired
	private EstudantesService estser;
	
	@GetMapping
	public List<EstudantesDTO> findAll(){
		List<EstudantesDTO> rest = estser.findAll();
		return rest;
	}

}
