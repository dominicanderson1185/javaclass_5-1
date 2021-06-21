import com.Actor;

import javax.persistence.*;

public class Main {
	public static void main(String[] args){


// So I think i have the basic done however I can't seem to get it to pull or show that the program is started I can use jbcd and it shows the
		//connection but I don't think thats what you want
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try{
			transaction.begin();
if(transaction.isActive()){
	System.out.println("I have started");
}
			transaction.commit();
		}	finally {
			if (transaction.isActive()){
				transaction.rollback();
			}
			entityManager.close();
			entityManagerFactory.close();

		}


	}

}
