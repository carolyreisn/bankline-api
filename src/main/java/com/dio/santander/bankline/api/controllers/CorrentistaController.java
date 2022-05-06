package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovoCorrentista;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;
import com.dio.santander.bankline.api.swagger.Messages;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = Messages.SWAGGER_TAG_CORRENTISTA_ENDPOINT)
@RestController
@RequestMapping("correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRespository;
	
	@Autowired
	private CorrentistaService correntistaService;
	
	@Operation(description = Messages.SWAGGER_GET_ALL)
	@GetMapping
	public List<Correntista> findAll(){
		return correntistaRespository.findAll();
	}
	
	@Operation(description = Messages.SWAGGER_INSERT)
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		correntistaService.save(correntista);
	}

}
