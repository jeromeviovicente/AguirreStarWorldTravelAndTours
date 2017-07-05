package dbsessions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseSession {
	private static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	
	public static Session getInstance(){
		Session session = sessionFactory.openSession();
		return session;
	}
	
	public static void close(){
		sessionFactory.close();
	}
}
