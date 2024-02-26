package com.prabhu.hibernate.IntroProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	Laptop l1 = new Laptop();
    	l1.setId(100);
    	l1.setName("Acer Aspire 7 A715-42G");
    	l1.setPrice(49490);
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class);
    	SessionFactory sf = con.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	session.save(l1);
    	tx.commit();
    	
    	
    }
}
