
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class BeanHelper {
  private static SessionFactory sessionFactory;
  private static Session session;
  public static void main(String args[])
  {
      sessionFactory=HibernateUtil.getSessionFactory();
      System.out.println("Session open: "+session.isOpen());
  }
}
