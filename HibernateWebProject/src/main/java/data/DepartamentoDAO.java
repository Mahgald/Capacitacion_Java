package data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtils;
import model.Departamento;

public class DepartamentoDAO {
	
	public static void altaDepartamento(Departamento dpto){
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Long id = (Long) sess.save(dpto);
		dpto.setId(id);
		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void bajaDepartamento(Departamento dpto)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.delete(dpto);		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void modificarDepartamento(Departamento dpto)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.update(dpto);
		sess.getTransaction().commit();		
		sess.close();		
	}
	
	public static List<Departamento> listarDepartamento()
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		List<Departamento> lista =sess.createQuery("from Departamento").list();
		sess.close();
		
		return lista;		
	}
	public static Departamento obtenerUnDepartamento(long id)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		Departamento dpto = sess.get(Departamento.class, id);		
		sess.close();
		
		return dpto;
		
	}
}
