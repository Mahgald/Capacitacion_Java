package data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import model.EmpleadoDetalles;

public class EmpleadoDetallesDAO implements IEmpleadoDetalles {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void addEmpleado(EmpleadoDetalles detalle) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(detalle);
		tx.commit();
		session.close();
		
	}

	public void updateEmpleado(EmpleadoDetalles detalle) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.update(detalle);
		tx.commit();
		session.close();
		
	}



}
