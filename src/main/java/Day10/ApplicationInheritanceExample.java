package Day10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Day10.models.Employee;
import Day10.models.Person;
import Day10.models.Student;

public class ApplicationInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dependency injection with setter
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationInheritanceContext.xml");
		
		//dependency injection with constructor, with 2 param
		//for this we created separate spring bean in xml file, with id employee1
		Person p1 = (Person) context.getBean("p1");
		System.out.println(p1);
		((AbstractApplicationContext) context).close();

	}

}
