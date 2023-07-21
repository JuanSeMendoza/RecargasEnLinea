package com.datacenter.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vendedor {
	
	@Id
	private Integer id;
	@Column 
	private Integer Id_Vendedor;
	@Column
	private Integer Id_registro;
	@Column 
	private String nombres;
	@Column 
	private String apellidos;
	@Column 
	private Integer telefono;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_Vendedor() {
		return Id_Vendedor;
	}
	public void setId_Vendedor(Integer id_Vendedor) {
		Id_Vendedor = id_Vendedor;
	}
	public Integer getId_registro() {
		return Id_registro;
	}
	public void setId_registro(Integer id_registro) {
		Id_registro = id_registro;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	
}
