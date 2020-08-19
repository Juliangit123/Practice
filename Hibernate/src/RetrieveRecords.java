import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class RetrieveRecords {
    public static void main(String[] args) {
        SessionFactory sessionFactory = singlton.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction begintransaction = session.beginTransaction();
        List list = session.createCriteria(StudentEntity.class).list();
        for (Object o:list){
            System.out.println(o);
        }

    }
}

