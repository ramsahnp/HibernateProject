package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {

	public static void main(String[] args) 
	{
		
		try{//creating configuration object  
	    Configuration cfg=new Configuration();  
	    cfg.configure("res/hibernate.cfg.xml");//populates the data of the configuration file  
	      
	    //creating seession factory object  
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
	    //creating session object  
	    Session session=factory.openSession();  
	      
	    //creating transaction object  
	    Transaction t=session.beginTransaction();  
	          
	    Employee e1=new Employee();  
	  //  e1.setId(115);  
	    e1.setName("Delip");
	    e1.setEmail("d@gmail.com");
	    e1.setAddr("delhi");
	    session.save(e1);//persisting the object  
	      
	    t.commit();//transaction is commited  
	    session.close();  
		
	      
	    System.out.println("successfully saved");  
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	   
		

	}

}
