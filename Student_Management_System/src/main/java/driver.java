import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class driver {
	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext(Myconfig.class);
		EntityManagerFactory emf = context.getBean(EntityManagerFactory.class);
		System.out.println(emf);
	}
}
