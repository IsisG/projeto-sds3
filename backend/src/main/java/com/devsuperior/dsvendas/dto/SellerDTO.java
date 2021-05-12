package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;

public class SellerDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//serialize objetos são convertidos em megabytes, boa medida para garantir tráfico na rede
//Entidade é monitorada pelo JPA(enquando está sendo monitorada a conexão do banco é aberta), usamos DTO pra comunicação entre controller e service
	private Long id;
	private String name;
	
	public SellerDTO() {
		
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller entity) {
		id = entity.getId();
		name = entity.getname();
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
