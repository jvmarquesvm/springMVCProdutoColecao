package com.padrao.spring.entities;

public class Product {
	private String id;
	private String name;
	private String photo;
	private double preco;
	private int quantidade;
	
	public Product(String id, String name, String photo, double preco, int quantidade) {
		super();
		this.id = id;
		this.name = name;
		this.photo = photo;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
		
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
