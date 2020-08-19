import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class singlton {
    private static SessionFactory sessionFactory;
    private singlton(){}
    public static SessionFactory getSessionFactory() {
        if(sessionFactory == null){
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
