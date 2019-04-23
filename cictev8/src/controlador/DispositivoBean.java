package controlador;

import java.util.List;

import javax.annotation.PostConstruct;

import dao.DispositivoDaoImp;
import dao.DispositivosDao;
import pojo.Dispositivo;
import pojo.Sensores;

public class DispositivoBean {

	private Dispositivo dispositivo;
	private List<Dispositivo> listDispositivo;
	
	

	@PostConstruct
	public void init() {
	    dispositivo = new Dispositivo();
	}
	
	public DispositivoBean() {
		this.dispositivo = new Dispositivo();
	}
	
	public Dispositivo getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	public List<Dispositivo> getListDispositivo() {
		DispositivosDao obj = new DispositivoDaoImp();
		listDispositivo = obj.listDispositivos();
		
		return listDispositivo;
	}
	public void setListDispositivo(List<Dispositivo> listDispositivo) {
		this.listDispositivo = listDispositivo;
	}
	
	
	
	
}
