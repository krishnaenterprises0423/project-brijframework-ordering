package com.brijframework.inventory.model.global;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EOGlobalItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="IDEN_NO")
	private String idenNo;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOGO_URL")
	private String logoUrl;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="TYPE_ID")
	private String typeId;

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	@Lob
	private String instructions;
	
	public String getIdenNo() {
		return idenNo;
	}

	public void setIdenNo(String idenNo) {
		this.idenNo = idenNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

}
