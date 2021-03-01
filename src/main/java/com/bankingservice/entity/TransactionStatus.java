package com.bankingservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transactionstatus")
public class TransactionStatus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="transaction_id")
private Long transactionId;
@Column(name="token_id")
private Integer tokenId;
@Column(name="customer_id")
private Integer customerId;
@Column(name="service_name")
private String serviceName;
@Column(name="amount")
private Integer amount;
@Column(name="status")
private String status;
@Column(name="review")
private String review;

	
	public Integer getTokenId() {
		return tokenId;
	}
	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "TransactionStatus [transactionId=" + transactionId + ", customerId=" + customerId + ", serviceName="
				+ serviceName + ", amount=" + amount + ", status=" + status + ", review=" + review + "]";
	}
	
	

}
