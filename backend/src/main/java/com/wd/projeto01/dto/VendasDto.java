package com.wd.projeto01.dto;

import java.time.LocalDate;

public class VendasDto {
	
	private Integer id;
	private Integer visitas;
	private Integer qtdVendas;
	private Double valor;
	private LocalDate data;
	private String nomeVendedor;
	
	public VendasDto() {}
	
	public VendasDto(Integer id, Integer visitas, Double valor, String nomeVendedor) {
		super();
		this.id = id;
		this.visitas = visitas;
		this.valor = valor;
		this.nomeVendedor = nomeVendedor;
		
	}


	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getVisitas() {
		return visitas;
	}
	
	public void setVisitas(Integer visitas) {
		this.visitas = visitas;
	}

	public Integer getQtdVendas() {
		return qtdVendas;
	}
	
	public void setQtdVendas(Integer qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}	
	
	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	
}
