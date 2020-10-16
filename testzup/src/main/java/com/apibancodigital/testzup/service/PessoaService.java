package com.apibancodigital.testzup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apibancodigital.testzup.model.Pessoa;
import com.apibancodigital.testzup.repository.PessoaRepository;

@Service
public class PessoaService {
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa salvar(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> listar() {
		return pessoaRepository.findAll();
	}
}
