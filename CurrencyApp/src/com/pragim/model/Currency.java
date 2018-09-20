package com.pragim.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table()
public class Currency {

	@Override
	public String toString() {
		return "Currency [id=" + id + ", name=" + name + ", symbol=" + symbol
				+ "]";
	}

	@Id
	@GeneratedValue
	@Column(name="cur_id")
	private int id;
	
	@Column(name="cur_name")
	private String name;
	
	@Column(name="cur_symbol")
	private String symbol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
