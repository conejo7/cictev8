package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Modelo;
import util.HibernateUtil;

public class DatabaseOperations {
	private static Transaction transObj;
	private static Session sessionObj = HibernateUtil.getSessionFactory().openSession();

	public void nuevoModelo(Modelo modelo) {
		Session s = null;
		try {
			s = HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			s.save(modelo);
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

	

}
