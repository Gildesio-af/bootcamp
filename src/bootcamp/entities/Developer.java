package bootcamp.entities;

import java.util.ArrayList;
import java.util.List;

import bootcamp.exceptions.NoCourseException;

public class Developer {
	private String name;
	private List<Mentoring> mentoring;
	private List<Course> courses;
	private Integer xp;
	
	public Developer(String name) {
		this.name = name;
		this.mentoring = new ArrayList<Mentoring>();
		this.courses = new ArrayList<Course>();
		this.xp = 0;
	}

	public Developer() {
	}
	
	public void subscripeBootcamp(Bootcamp bootcamp) {
		bootcamp.getDevelopers().add(this);
	}
	
	public void progress(Course course) {
		this.courses.add(course);
	}
	
	public void progress(Mentoring mentoring) {
		this.mentoring.add(mentoring);
	}
	
	public void printCourses() {
		if(!courses.isEmpty()) {
			System.out.println("Lista de cursos cuncluidos:");
			courses.stream().forEach(System.out::println);
		}else
			throw new NoCourseException("Nenhum curso concluido");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mentoring> getMentoring() {
		return mentoring;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}
}
