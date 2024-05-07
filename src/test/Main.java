package test;

import java.time.LocalDate;

import bootcamp.entities.Bootcamp;
import bootcamp.entities.Course;
import bootcamp.entities.Developer;

public class Main {
	
	public static void main(String[] args) {
		Bootcamp java = new Bootcamp("Java-Dio", "Desenvolvimento web back-end", LocalDate.now(), LocalDate.of(2024, 7, 11));
		Developer dev = new Developer("Xaolim matador de porco");
		Course spring = new Course("Spring Boot com java", "Conceitos de java web com sprig boot", 2, 12);
		
		java.getCourse().add(spring);
		java.getDevelopers().add(dev);
		dev.getCourses().add(spring);
		dev.printCourses();
	}
}
