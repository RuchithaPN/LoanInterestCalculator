package com.second.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SimpleInterest")
public class SimpleInterest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double principal;

    @Column(nullable = false)
    private Double rate;

    @Column(nullable = false)
    private Double time;

    @Column(nullable = false)
    private Double interest;

    @Column(nullable = false)
    private Double total;

    public SimpleInterest() {}

    public SimpleInterest(Double principal, Double rate, Double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

	public SimpleInterest(Long id, Double principal, Double rate, Double time, Double interest, Double total) {
		super();
		this.id = id;
		this.principal = principal;
		this.rate = rate;
		this.time = time;
		this.interest = interest;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrincipal() {
		return principal;
	}

	public void setPrincipal(Double principal) {
		this.principal = principal;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getTime() {
		return time;
	}

	public void setTime(Double time) {
		this.time = time;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

    
}

