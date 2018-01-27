package org.uwyo.model.inherembedd;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverrides({
	@AttributeOverride(name="name",column=@Column(name="WEIGHT_NAME")),
	@AttributeOverride(name="symbol",column=@Column(name="WEIGHT_SYMBOL"))
})
public class Weight extends Measurements {
	
	@Column(name="WEIGHT")
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double d) {
		this.weight = d;
	}
	
}
