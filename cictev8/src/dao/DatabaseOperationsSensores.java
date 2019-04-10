package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Modelo;
import pojo.Sensores;
import util.HibernateUtil;

public class DatabaseOperationsSensores {

	private static Transaction transObj;
	private static Session sessionObj = HibernateUtil.getSessionFactory().openSession();

	public List<Sensores> listaSensores() {

		List<Sensores> listSensores = null;
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		String hql = "FROM Sensores";
		System.out.println("query"+hql);	
		try {
			listSensores = s.createQuery(hql).list();
			System.out.println("lista"+listSensores);	
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
}
