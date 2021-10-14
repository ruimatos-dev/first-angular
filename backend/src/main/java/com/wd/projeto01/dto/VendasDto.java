package com.wd.projeto01.dto;

public class VendasDto {
	
	private Integer id;
	private Integer visitas;
	private Integer qtdVendas;
	
	public VendasDto() {}
	
	public VendasDto(Integer id, Integer visitas, Integer qtdVendas) {
		super();
		this.id = id;
		this.visitas = visitas;
		this.qtdVendas = qtdVendas;
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

	
}
