package com.example.krishnabainternal;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config=new Configuration().configure().addAnnotatedClass(Movie.class).addAnnotatedClass(Producer.class);
        SessionFactory sf=config.buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=s.beginTransaction();
        
        
        Movie m1 = new Movie();
        m1.setId(1);
        m1.setName("Dhoom");
        m1.setDate("15/5/2012");
        m1.setDesrription("action movie");
        
        Movie m2 = new Movie();
        m2.setId(2);
        m2.setName("Dhoom2");
        m2.setDate("15/5/2014");
        m2.setDesrription("actionAndComedyovie");
        
        
        Movie m3 = new Movie();
        m3.setId(3);
        m3.setName("Dhoom3");
        m3.setDate("15/5/2016");
        m3.setDesrription("ComedyMovie");
        
        
        
        Producer p1 = new Producer();
        p1.setId(1);
        p1.setName("Lala");
        p1.setCompany("Ramoji");
        
        Producer p2 = new Producer();
        p2.setId(2);
        p2.setName("Rohit");
        p2.setCompany("Reliance");
        
        
        Producer p3 = new Producer();
        p3.setId(3);
        p3.setName("Kohli");
        p3.setCompany("TRS");
        
        
        
//      Assigning parents to students
        m1.setProducer(p1);
        m2.setProducer(p2);
        m3.setProducer(p3);

        
//        s.save(m1);
//        s.save(m2);
//        s.save(m3);
//        s.save(p1);
//        s.save(p2);
//        s.save(p3);
        
        tr.commit();
        
        
        Movie e = (Movie) s.get(Movie.class, 2);
        System.out.println("ID: "+e.getId());
        System.out.println("Movie Name: "+e.getName());
        System.out.println("Date of Release: "+e.getDate());
        System.out.println("Movie Description: "+e.getDesrription());
        
        
        
        
        System.out.println("----------------------------------------------");
        
        // This is DELETE query part
//        Query query = s.createQuery("DELETE FROM Movie WHERE id = :f");
//        query.setParameter("f",1);
//        int row = query.executeUpdate();
//        if(row>0)
//        	System.out.println("Data Deleted");
//        else
//        	System.out.println("ERROR");
//        tr.commit();
        
        
 System.out.println("----------------------------------------------");
        
        // This is UPDATE query part
//        Query query = s.createQuery("UPDATE Movie SET name=:f WHERE id=:i ");
//        query.setParameter("f", "Tismarkhan");
//        query.setParameter("i", 2);
//
	//		int row=query.executeUpdate();
	//		if(row>0)
	//			  System.out.println("Data updated..");
	//		else
	//			  System.out.println("Error..");
//			tr.commit();
        
    }

	private static void setProducer(Producer p1) {
		// TODO Auto-generated method stub
		
	}
}