package org.cibertec.edu.pe.modelo;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import javax.persistence.Id;

@Entity
@Table(name = "Regempleado")
public class Empleado {
	
	@Id
	@Column(name = "idempleado")
	private String Id;
	private String Apellidos;
	private String Nombres;
	private int  Edad;
	private char Sexo;
	private int Salario;
	
	
	public Empleado() {
		super();
	}


	
	public Empleado(String id, String apellidos, String nombres, int edad, char sexo, int salario) {
		super();
		Id = id;
		Apellidos = apellidos;
		Nombres = nombres;
		Edad = edad;
		Sexo = sexo;
		Salario = salario;
	}


	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public int getSalario() {
		return Salario;
	}
	public void setSalario(int salario) {
		Salario = salario;
	}
	
	
	
	
	
	
	
	
	
    
    
	

	

	
	

	
	
	
	 

}
