package pojo;
// Generated 09/04/2019 19:54:04 by Hibernate Tools 4.3.5.Final

/**
 * Datos generated by hbm2java
 */
public class Datos implements java.io.Serializable {

	private Integer iddatos;
	private Sensores sensores;
	private String nombre;
	private String descripcion;

	public Datos() {
	}

	public Datos(Sensores sensores) {
		this.sensores = sensores;
	}

	public Datos(Sensores sensores, String nombre, String descripcion) {
		this.sensores = sensores;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getIddatos() {
		return this.iddatos;
	}

	public void setIddatos(Integer iddatos) {
		this.iddatos = iddatos;
	}

	public Sensores getSensores() {
		return this.sensores;
	}

	public void setSensores(Sensores sensores) {
		this.sensores = sensores;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
