package com.apibancodigital.testzup.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apibancodigital.testzup.model.Conta;
import com.apibancodigital.testzup.model.Transacao;

@Repository
@Transactional(readOnly = false)
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
	List<Transacao> findByContaIn(Conta conta);
			
	
}
