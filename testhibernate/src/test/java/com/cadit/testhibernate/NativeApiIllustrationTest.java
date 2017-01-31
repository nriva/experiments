package com.cadit.testhibernate;


import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.*;

import beans.Event;



/**
 * Illustrates use of Hibernate native APIs.
 *
 * @author Steve Ebersole
 */
public class NativeApiIllustrationTest extends TestCase {
	private SessionFactory sessionFactory;

	@Override
	protected void setUp() throws Exception {
		// A SessionFactory is set up once for an application
		
        Configuration configuration = new Configuration();
        configuration.configure();
        
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
        		.applySettings(configuration.getProperties())
        		.build();        
        
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);                
	}

	@Override
	protected void tearDown() throws Exception {
		if ( sessionFactory != null ) {
			sessionFactory.close();
		}
	}

	public void testBasicUsage() {
		
		// create a couple of events...
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.createQuery("delete from Event").executeUpdate();
		

		session.save( new Event( "Our very first event!", new Date() ));
		session.save( new Event( "A follow up event", new Date() ) );
		session.getTransaction().commit();
		session.close();

		// now lets pull events from the database and list them
		session = sessionFactory.openSession();
        session.beginTransaction();
        @SuppressWarnings("unchecked")
		List<Event> result = session.createQuery( "from Event" ).list();
		for ( Event event : (List<Event>) result ) {
			
			event.setTitle("pippo");
			session.save(event);
			
		}
        session.getTransaction().commit();
        session.close();
	}
}
