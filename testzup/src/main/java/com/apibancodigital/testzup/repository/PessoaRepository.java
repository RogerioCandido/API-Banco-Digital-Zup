package com.apibancodigital.testzup.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apibancodigital.testzup.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	Optional<Pessoa> findByNome (String nome);
	Pessoa findByCpf(String cpf);
}
