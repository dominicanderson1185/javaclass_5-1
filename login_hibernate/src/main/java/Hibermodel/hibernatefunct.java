package Hibermodel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import hib_user.hi_model;
import hiber_conf.hibernatecon;


public class hibernatefunct {




	public boolean validate(String user_name, String password) {

		Transaction transaction = null;
		hi_model user = null;
		try (Session session = hibernatecon.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			//user = (hi_model) session.createQuery("select user_name  FROM new_table; ").setParameter("user_name", user_name).uniqueResult();

			/*if (user != null && user.getPassword().equals(password)) {
				return true;
			}*/
			if (user_name = user.getUsername() && password == user.getPassword()){return true;}
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return true;
	}

}
