package one_to_many_bi_dao;

import one_to_many_bi_dto.Phone;
import one_to_many_bi_dto.Sim;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Simdao {

	public void savePhone(Phone phone) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(phone);
		List<Sim> sim = phone.getSim();
		for (Sim sims : sim) {
			entityManager.persist(sims);
		}
		entityTransaction.commit();

	}

}
