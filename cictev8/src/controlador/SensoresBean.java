package controlador;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;

import dao.SensoresDao;
import dao.SensoresDaoImp;
import pojo.Dispositivo;
import pojo.Sensores;


public class SensoresBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Sensores sensores;
	private List<Sensores> listSensores;
	private Dispositivo dispositivo;
	private List<SelectItem> listDispositivos;
	
	
	
	@PostConstruct
	public void init() {
	    sensores = new Sensores();
	    sensores.setDispositivo(dispositivo);
	}
	
	public SensoresBean() {
		this.sensores = new Sensores();
	}
	
	
	public SensoresBean(Sensores sensores, Dispositivo dispositivo) {
		super();
		this.sensores = sensores;
		this.dispositivo = dispositivo;
	}


	public Dispositivo getDispositivo() {
		return dispositivo;
	}


	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}


	public SensoresBean(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	
	
	public Sensores getSensores() {
		return sensores;
	}



	public void setSensores(Sensores sensores) {
		this.sensores = sensores;
	}



	public List<Sensores> getListSensores() {
		SensoresDao obj = new SensoresDaoImp();
		listSensores = obj.listSensores();
		return listSensores;
	}



	public void setListSensores(List<Sensores> listSensores) {
		this.listSensores = listSensores;
	}

	public void nuevoSensor() {
		SensoresDao obj = new SensoresDaoImp();
		obj.nuevoSensor(sensores);
		
		
	}
	
	public void editarSensor() {
		SensoresDao obj =new SensoresDaoImp();
		obj.editarSensor(sensores);
		this.sensores = new Sensores();
	}
	

	public void eliminarSensor() {
		SensoresDao obj = new SensoresDaoImp();
		obj.eliminarSensor(sensores);
		this.sensores = new Sensores();
	}
	 
    public List<Sensores> findAll(){
    	SensoresDao obj = new SensoresDaoImp();
		listSensores= obj.listSensores();
       return listSensores;
   }
    
    public void prepararNuevoSensor(){
		this.sensores = new Sensores();
	}
    
    
    
    public List<SelectItem> getListDispositivos() {
    	this.listDispositivos = new ArrayList<SelectItem>();
    	SensoresDao obj = new SensoresDaoImp();
    	List<Dispositivo> dis= obj.listDispositivos();
    	listDispositivos.clear();
    	
    	for (Dispositivo dispositivo : dis) {
			SelectItem dispositivoItem = new SelectItem(dispositivo.getIddispositivo().toString(),dispositivo.getNombre());
			this.listDispositivos.add(dispositivoItem);
		}
		return listDispositivos;
	}


	public void setListDispositivos(List<SelectItem> listDispositivos) {
		this.listDispositivos = listDispositivos;
	}


	
    
}
