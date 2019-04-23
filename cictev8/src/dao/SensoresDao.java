package dao;

import java.util.List;

import pojo.Dispositivo;
import pojo.Sensores;

public interface SensoresDao {

	public void nuevoSensor(Sensores sensores);	
	public void editarSensor(Sensores sensores);
	public void eliminarSensor(Sensores sensores);
	public List<Sensores> listSensores();
	public List<Dispositivo> listDispositivos();
	public Integer findDispositivoById();
	
}
