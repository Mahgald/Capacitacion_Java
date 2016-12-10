package data;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.HibernateUtils;
import model.Empleado;

public class EmpleadoDAO {

	public static void altaEmpleado(Empleado emple){
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();
		sess.beginTransaction();
		
		Long id = (Long) sess.save(emple);
		emple.setId(id);
		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void bajaEmpleado(Empleado emple)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.delete(emple);		
		sess.getTransaction().commit();
		sess.close();
	}
	
	public static void modificarEmpleado(Empleado emple)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		sess.beginTransaction();		
		sess.update(emple);
		sess.getTransaction().commit();		
		sess.close();		
	}
	
	public static List<Empleado> listarEmpleado()
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		List<Empleado> lista =sess.createQuery("from Empleado").list();
		sess.close();
		
		return lista;		
	}
		
	public static Empleado obtenerUnEmpleado(long id)
	{
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session sess = sf.openSession();	
		
		Empleado emple = sess.get(Empleado.class, id);		
		sess.close();
		
		return emple;
		
	}

	
}
