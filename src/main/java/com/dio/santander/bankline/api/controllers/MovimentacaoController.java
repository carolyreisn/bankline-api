package com.dio.santander.bankline.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.santander.bankline.api.dto.NovaMovimentacao;
import com.dio.santander.bankline.api.model.Movimentacao;
import com.dio.santander.bankline.api.repository.MovimentacaoRepository;
import com.dio.santander.bankline.api.service.MovimentacaoService;
import com.dio.santander.bankline.api.swagger.Messages;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = Messages.SWAGGER_TAG_MOVIMENTACAO_ENDPOINT)
@RestController
@RequestMapping("movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository movimentacaoRespository;
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@Operation(description = Messages.SWAGGER_GET_ALL)
	@GetMapping
	public List<Movimentacao> findAll(){
		return movimentacaoRespository.findAll();
	}
	
	@Operation(description = Messages.SWAGGER_INSERT)
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		movimentacaoService.save(movimentacao);
	}

}
