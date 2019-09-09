package HibernatePractice;

import java.sql.Date;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateMain {

	private static SessionFactory factory;

	public static void main(String[] args) {

		factory = new Configuration().configure().buildSessionFactory();
		Date date = new Date(System.currentTimeMillis());
		StudentClient stud= new StudentClient();
		
		stud.setSTUD_NAME("Zair");
		stud.setSTUD_MARKS(88);
		stud.setSTUD_JOIN_DATE(date);
		Session session = factory.openSession();

		Transaction tnx = session.beginTransaction();
		//Session session = factory.openSession();
		session.save(stud);
		tnx.commit();

		session.close();

	}

}