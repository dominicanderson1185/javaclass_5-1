import com.Actor;

import javax.persistence.*;

public class Main {
	public static void main(String[] args){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		try{
			transaction.begin();

			Actor actor = new Actor();
			actor.setActorId(650);
			actor.setFirstName("Fred");
			actor.setLastName("Johnson");
			actor.setLastUpdate(2006-04-2020);
			entityManager.persist(actor);

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
