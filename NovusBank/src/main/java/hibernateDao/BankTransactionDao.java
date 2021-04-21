package hibernateDao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernateModel.BankTransaction;
import hibernateUtil.HibernateUtil;

public class BankTransactionDao {
    public void saveBankTransaction(BankTransaction bankTransaction) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(bankTransaction);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
}

