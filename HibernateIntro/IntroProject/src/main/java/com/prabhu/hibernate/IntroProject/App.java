package com.prabhu.hibernate.IntroProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	
    	// Configuration
    	Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Laptop.class);
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    	Session session = sf.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	/*
    	 * Save object into db
    	 */
    	
    	LaptopName laptopName = new LaptopName();
    	laptopName.setBrand("Lenovo");
    	laptopName.setModel("Thinkpad");
    	laptopName.setVersion(14);
    	
    	Laptop l1 = new Laptop();
    	l1.setId(102);
    	l1.setLaptopName(laptopName);
    	l1.setPrice(56720);
    	// session.save(l1);	// uncomment this to save to db
    	
    	/*
    	 * Get object from db
    	 */
    	Laptop l2;
    	l2 = (Laptop) session.get(Laptop.class, 101);
    	System.out.println(l2);
    	
    	tx.commit();
    	
    	
    }
}
