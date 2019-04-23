package controlador;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Controlador implements Serializable {

	public Controlador() {

	}

	public String visualizaSensor(Integer s) {
		if (s == 1) {
			return "acelerometro";
		} else if (s == 2) {
			return "giroscopio";
		} else if (s == 3) {
			return "magnetometro";
		} else if (s == 4) {
			return "acelerometro";
		} else if (s == 5) {
			return "acelerometro";
		} else if (s == 6) {
			return "acelerometro";
		} else if (s == 7) {
			return "acelerometro";
		} else if (s == 8) {
			return "acelerometro";
		} else if (s == 9) {
			return "acelerometro";
		} else if (s == 10) {
			return "acelerometro";
		} else {
			return "index";
		}

	}

}
