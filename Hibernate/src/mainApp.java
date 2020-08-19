import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class mainApp {
    public static void main(String[] args) {
        StudentEntity st = new StudentEntity();
        st.setName("julian");
        st.setEmail("julian31@gmail.com");
        st.setAddress("Monrovia");
        st.setPhoneNumber("02422394343");

        SessionFactory sessionFactory = singlton.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(st);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
