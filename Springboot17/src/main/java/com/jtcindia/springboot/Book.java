package com.jtcindia.springboot;
import java.math.BigDecimal;
public class Book {
	private Integer bid;
	private String bname;
	private String author;
	private BigDecimal price;
	private String publication;
	public Book() {
		System.out.println("Default Constructor");
	}
	public Book(Integer bid, String bname, String author, BigDecimal price, String publication) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
		this.price = price;
		this.publication = publication;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
}
