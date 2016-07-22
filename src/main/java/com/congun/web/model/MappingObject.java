package com.congun.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "mappingobject")
public class MappingObject {

	@Id
	public long requirementId;
	public long supplierId;
	public String requeststatus;
	public int activeFlag;
	public String supplierList;
	
	public String getSupplierList() {
		return supplierList;
	}
	public void setSupplierList(String supplierList) {
		this.supplierList = supplierList;
	}
	public long getRequirementId() {
		return requirementId;
	}
	public void setRequirementId(long requirementId) {
		this.requirementId = requirementId;
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public String getRequeststatus() {
		return requeststatus;
	}
	public void setRequeststatus(String requeststatus) {
		this.requeststatus = requeststatus;
	}
	public int getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(int activeFlag) {
		this.activeFlag = activeFlag;
	}
	
	
}
