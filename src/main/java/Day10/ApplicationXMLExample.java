package Day10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Day10.models.Employee;
import Day10.models.Student;

public class ApplicationXMLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * the old way, java style
		Student s1 = new Student();
		s1.setName("Joel");*/
		
		/**/
		
		//dependency injection with setter
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); //this will already invoke parameter constr of Employee, due to initialization
		Student s1 = (Student) context.getBean("student");
		System.out.println(s1.getName());
		
		//dependency injection with constructor, with 1 param
		//spring bean id = employee
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1);
		
		//dependency injection with constructor, with 2 param
		//for this we created separate spring bean in xml file, with id employee1
		Employee e2 = (Employee) context.getBean("employee1");
		System.out.println(e2);
		((AbstractApplicationContext) context).close();
	}

}
