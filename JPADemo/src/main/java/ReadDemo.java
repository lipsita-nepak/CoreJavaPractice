import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import bean.Student;

public class ReadDemo {
	public static void main(String[] args) {
		
		// Create instance of EntityManagerFactory - Load & Register drivers
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");

		// Create instance for EntityManager using EntityManagerFactory  - Create connection
		EntityManager em = emf.createEntityManager();

		// Begin transaction - statement
		em.getTransaction().begin();

		// Perform CRUD operations - Execute queries
		// Get all students
		Query query=em.createQuery("from Student");
		List<Student> std = query.getResultList();
		for(Student s:std) {
			System.out.println(s);
		}
		
		//get students according to rollNo
		System.out.println();
		Student std1=em.find(Student.class, 12);
		System.out.println(std1);
		

		// Commit transaction 
		em.getTransaction().commit();

		// Release the resources. - close connection
		em.close();
		emf.close();
	}


}
