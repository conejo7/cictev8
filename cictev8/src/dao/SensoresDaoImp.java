package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Dispositivo;
import pojo.Sensores;
import util.HibernateUtil;

public class SensoresDaoImp implements SensoresDao {

	private static Transaction transObj;
	private static Session sessionObj = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void nuevoSensor(Sensores sensores) {
		// TODO Auto-generated method stub
		Session s = null;
		try {
			s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.save(sensores);
			s.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	@Override
	public void editarSensor(Sensores sensores) {
		// TODO Auto-generated method stub
		Session s = null;
		try {
			s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.update(sensores);
			s.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	@Override
	public void eliminarSensor(Sensores sensores) {
		Session s = null;
		try {
			s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.delete(sensores);
			s.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			if (s != null) {
				s.close();
			}
		}

	}

	@Override
	public List<Sensores> listSensores() {
		List<Sensores> listSensores = null;
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		String hql = "FROM Sensores";
		try {
			listSensores = s.createQuery(hql).list();
			// getResult
			t.commit();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			t.rollback();
		}
		return listSensores;
	}

	@Override
	public List<Dispositivo> listDispositivos() {
		List<Dispositivo> listaDeDispositivos = null;
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		String hql = "FROM Dispositivo";

		try {
			listaDeDispositivos = s.createQuery(hql).list();
			t.commit();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			t.rollback();
		}

		return listaDeDispositivos;
	}

	@Override
	public Integer findDispositivoById() {
		
		return null;
	}

}
