package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Dispositivo;
import pojo.Modelo;
import util.HibernateUtil;

public class DispositivoDaoImp implements DispositivosDao {

	
	private static Transaction transObj;
	private static Session sessionObj = HibernateUtil.getSessionFactory().openSession();

	@Override
	public void nuevoDispositivo(Dispositivo dispositivo) {
		
			Session s = null;
			try {
				s = HibernateUtil.getSessionFactory().openSession();
				s.beginTransaction();
				s.save(dispositivo);
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
	public List<Dispositivo> listDispositivos() {
		// TODO Auto-generated method stub
		List<Dispositivo> listDispositivos =null;
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		String hql="FROM Dispositivo";
		try {
			listDispositivos = s.createQuery(hql).list();
			t.commit();
			s.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			t.rollback();
		
		}
		
		return listDispositivos;
	}
	

}
