package com.datacenter.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tbl_vendedor {

	@Id
	private Integer id_vendedor;
	@Column 
	private String nombre;
	@Column 
	private String apellido;
	@Column 
	private Integer telefono;
	@Column
	private Date fecha_ingreso;
	@Column
	private Boolean activo;

}
