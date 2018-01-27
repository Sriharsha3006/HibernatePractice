package org.uwyo.model.inherembedd;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Measurements {
	
	private String name;
	
	private String symbol;

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
