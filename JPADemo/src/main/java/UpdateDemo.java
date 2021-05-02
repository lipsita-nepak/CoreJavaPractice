import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bean.Student;

public class UpdateDemo {
	public static void main(String[] args) {
		
		// Create instance of EntityManagerFactory - Load & Register drivers
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");

		// Create instance for EntityManager using EntityManagerFactory  - Create connection
		EntityManager em = emf.createEntityManager();
        
		// Begin transaction - statement
		em.getTransaction().begin();

		// Perform CRUD operations - Execute queries

		/*Student std=em.find(Student.class,07);
		std.setDept("civil");*/

		//em.createNativeQuery("")
		
		// Commit transaction 
		em.getTransaction().commit();

		// Release the resources. - close connection
		em.close();
		emf.close();
	}


}
