package com.bankingservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bankqueue")
public class BankQueue {
	
	@Id
	@Column(name="service_name")
	private String serviceName;
	@Column(name="token_id")
	private Integer tokenId;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getTokenId() {
		return tokenId;
	}
	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}
	@Override
	public String toString() {
		return "BankQueue [serviceName=" + serviceName + ", tokenId=" + tokenId + "]";
	}

	
	
	

}

