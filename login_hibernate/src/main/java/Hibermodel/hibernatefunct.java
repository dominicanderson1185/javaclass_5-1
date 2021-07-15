package Hibermodel;
import org.hibernate.Session;
import org.hibernate.Transaction;

import hib_user.hi_model;
import  hiber_conf.hibernatecon;


public class hibernatefunct{


	public void saveUser(hi_model user) {
		Transaction transaction = null;
		try (Session session = hibernatecon.getSessionFactory().openSession()) {
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

	public boolean validate(String userName, String password) {

		Transaction transaction = null;
		hi_model user = null;
		try (Session session = hibernatecon.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			user = (hi_model) session.createQuery("FROM hi_model U WHERE U.username = :userName").setParameter("userName", userName)
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

}
