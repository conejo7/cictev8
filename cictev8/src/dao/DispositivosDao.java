package dao;

import java.util.List;

import pojo.Dispositivo;

public interface DispositivosDao  {

	public void nuevoDispositivo(Dispositivo dispositivo);	
	public List<Dispositivo> listDispositivos();
	
}
