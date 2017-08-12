package test;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class MyGen implements IdentifierGenerator
{

	@Override
	public Serializable generate(SessionImplementor arg0, Object arg1) throws HibernateException
	{
		int i=11;
		
		return "ICICI"+i+1;
	}

}
