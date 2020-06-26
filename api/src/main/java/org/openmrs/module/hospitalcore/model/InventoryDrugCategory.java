package org.openmrs.module.hospitalcore.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.lang.StringUtils;

public class InventoryDrugCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private String description;

	private Date createdOn;

	private String createdBy;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public String getNameShort() {
		return (!StringUtils.isBlank(this.name) && this.name.length() > 30) ? (this.name.substring(0, 30) + "...") : this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
