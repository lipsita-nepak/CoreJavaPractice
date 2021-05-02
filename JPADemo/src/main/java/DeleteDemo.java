import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Query;

import bean.Student;

public class DeleteDemo {
	public static void main(String[] args) {
		
		// Create instance of EntityManagerFactory - Load & Register drivers
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");

		// Create instance for EntityManager using EntityManagerFactory  - Create connection
		EntityManager em = emf.createEntityManager();
       try {
		// Begin transaction - statement
		em.getTransaction().begin();

		// Perform CRUD operations - Execute queries
		
		/*Student std=em.find(Student.class, 07);
		em.remove(std);*/
		
	    Query query=(Query) em.createNativeQuery("alter table student drop dept");
	    query.executeUpdate();
		
		// Commit transaction 
		em.getTransaction().commit();
		System.out.println("column successfully deleted");
       }
       catch(Exception e) {
    	   e.printStackTrace();
       }
		// Release the resources. - close connection
		em.close();
		emf.close();
	}


}
