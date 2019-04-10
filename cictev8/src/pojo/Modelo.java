package pojo;
// Generated 09/04/2019 19:54:04 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.DatabaseOperations;



/**
 * Modelo generated by hbm2java
 */

@ManagedBean 
@SessionScoped
public class Modelo implements java.io.Serializable {

	private Integer idmodelo;
	private String descripcion;
	private Set dispositivos = new HashSet(0);
	public static DatabaseOperations dbObj;
	private static final long serialVersionUID = 1L;
	
	public Modelo() {
	}

	

	public Modelo(String descripcion, Set dispositivos) {
		this.descripcion = descripcion;
		this.dispositivos = dispositivos;
	}

	public Integer getIdmodelo() {
		return this.idmodelo;
	}

	public void setIdmodelo(Integer idmodelo) {
		this.idmodelo = idmodelo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set getDispositivos() {
		return this.dispositivos;
	}

	public void setDispositivos(Set dispositivos) {
		this.dispositivos = dispositivos;
	}
	
	public void nuevoModelo() {

		dbObj = new DatabaseOperations();
		dbObj.nuevoModelo(this);

	}
	

}