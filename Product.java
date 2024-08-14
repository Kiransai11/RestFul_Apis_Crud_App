package com.kiran.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Products")
public class Product {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name = "Product_Id")
	private Integer pid;
	@Column(name = "Product_Name")
	private String pname;
	@Column(name = "Product_Price")
	private Double pprice;

}
