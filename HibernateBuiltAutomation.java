b)	Develop an application to create a Hibernate application to write a query using Maven build automation application
User.java
package mypack;
public class user {
private int id;
private String name;
public int getid()
{	return id;
}
public void setid(int id)
{	this.id=id;
}
public String getname()
{	return name;
}
public void setname(String name)
{	this.name=name;
}}





//Main1.java
package mypack;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class main1 
{	public static void main(String a[])
	{	Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		user u=new user();	u.setid(101);	u.setname("Paul");	
session.save(u);	
		tx.commit();     
} }



//Hibernate.cfg.xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE hibernate-configuration PUBLIC   "-//Hibernate/Hibernate Configuration DTD 3.0//EN"  
 "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">  
  <hibernate-configuration>  
      <session-factory>  
        <property name="hbm2ddl.auto">update</property>  
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>  
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/paul</property>  
        <property name="hibernate.connection.username">root</property>  
        <property name="hibernate.connection.password">root</property>  
        <property name="hibernate.connection.driver_class">com.mysql.jdbc.Driver</property>  
        <property name="show_sql">true</property>
        <property name="format_sql">true</property>
    <mapping resource="user.hbm.xml"/>  
    </session-factory>  
  </hibernate-configuration>  
