package org.uwyo.model.inherembedd;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AttributeOverrides({
		@AttributeOverride(name="name",column=@Column(name="DIMENSION_NAME")),
		@AttributeOverride(name="symbol",column=@Column(name="DIMENSION_SYMBOL"))
})
public class Dimensions extends Measurements{
	
	@Column(name="DEPTH")
	private double depth;
	
	@Column(name="HIEGHT")
	private double height;
	
	@Column(name="WIDTH")
	private double width;

	public double getDepth() {
		return depth;
	}

	public void setDepth(double d) {
		this.depth = d;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
