package hibernateDao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateModel.User;
import hibernateUtil.HibernateUtil;

public class UserDao {
    public void saveUser(User user) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(user);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public boolean validate(String email, String password) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (User) session.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email)
                .uniqueResult();
            	
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return false;
    }
    
    public User getUser(String email, String password) {

        Transaction transaction = null;
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            user = (User) session.createQuery("FROM User U WHERE U.email = :email").setParameter("email", email)
                .uniqueResult();
            	
            if (user != null && user.getPassword().equals(password)) {
                return user;
            }
        
    	return null;
        }
    }
    
    public boolean updateBal(User user) {
    	 Transaction transaction = null;
         try (Session session = HibernateUtil.getSessionFactory().openSession()) {
             // start a transaction
             transaction = session.beginTransaction();
             // update the  object
             session.update(user);
             return true;
             
         } catch (Exception e) {
             if (transaction != null) {
                 transaction.rollback();
             }
             e.printStackTrace();
             return false;
         }
    }
}

