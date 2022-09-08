package com.gdsolutions.client.dto;

import java.io.Serializable;
import java.time.Instant;

import com.gdsolutions.client.entities.Client;

public class ClientDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String cpf;
	private Double income;
	private Instant birthday;
	private Integer children;
	
	public ClientDTO() {
		
	}

	public ClientDTO(Client entity) {

		this.id = entity.getId();
		this.name = entity.getName();
		this.cpf = entity.getCpf();
		this.income = entity.getIncome();
		this.birthday = entity.getBirthDay();
		this.children = entity.getChildren();
	}

	
	public ClientDTO(Long id, String name, String cpf, Double income, Instant birthday, Integer children) {
		super();
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthday = birthday;
		this.children = children;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirthday() {
		return birthday;
	}

	public void setBirthday(Instant birthday) {
		this.birthday = birthday;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
	
	
}
