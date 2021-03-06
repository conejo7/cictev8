package pojo;
// Generated 09/04/2019 19:54:04 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private Integer idRol;
	private String etiqueta;
	private String ruta;
	private String nivel;
	private Set usuarios = new HashSet(0);

	public Rol() {
	}

	public Rol(String etiqueta, String ruta, String nivel, Set usuarios) {
		this.etiqueta = etiqueta;
		this.ruta = ruta;
		this.nivel = nivel;
		this.usuarios = usuarios;
	}

	public Integer getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public String getEtiqueta() {
		return this.etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getNivel() {
		return this.nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Set getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Set usuarios) {
		this.usuarios = usuarios;
	}

}
