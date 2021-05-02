import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bean.Student;

public class JPADemo {

	public static void main(String[] args) {
		
			// Create instance of EntityManagerFactory - Load & Register drivers
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");

			// Create instance for EntityManager using EntityManagerFactory  - Create connection
			EntityManager em = emf.createEntityManager();

			// Begin transaction - statement
			em.getTransaction().begin();

			// Perform CRUD operations - Execute queries
			
			//Student std1 = new Student(12, "chinmaya","cse");
			//Student std2 = new Student(09, "biswajit","cse");

			
			//Student std1 = new Student(07, "baishnobi","cse");
			//Student std2 = new Student(21, "lipsita","cse");
			
			//Student std1=new Student(07,"teddy","cse","bam");
            Student std1=new Student(11,"lipso","cse");
			
			em.persist(std1); 
			//em.persist(std2);
			

			// Commit transaction 
			em.getTransaction().commit();

			// Release the resources. - close connection
			em.close();
			emf.close();
		}


	}


