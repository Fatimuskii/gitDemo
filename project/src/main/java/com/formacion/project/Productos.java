package com.formacion.project;

public class Productos {
	
	public Productos(int id, String nombreProducto) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
	}
	private int id;
	private String nombreProducto;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

}
