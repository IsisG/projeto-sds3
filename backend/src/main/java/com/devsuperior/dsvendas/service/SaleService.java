package com.devsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.entity.Sale;
import com.devsuperior.dsvendas.repositories.SaleRepository;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	//Pegeable para paginação ; Transactional -> garante que toda operação do banco será resolvida no momento do service; ReadOnly = não faz lock no banco, apenas leitura
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pegeable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pegeable);	
		return result.map(x -> new SaleDTO(x));
	}

}
