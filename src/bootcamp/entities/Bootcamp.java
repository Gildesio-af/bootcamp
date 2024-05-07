package bootcamp.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
	private String name;
	private String description;
	private LocalDate initialDate;
	private LocalDate finalDate;
	
	private List<Developer> developers;
	private List<Mentoring> mentoring;
	private List<Course> course;
	
	public Bootcamp(String name, String description, LocalDate initialDate, LocalDate finalDate) {
		this.name = name;
		this.description = description;
		this.initialDate = initialDate;
		this.finalDate = finalDate;
		this.developers = new ArrayList<Developer>();
		this.mentoring = new ArrayList<Mentoring>();
		this.course = new ArrayList<Course>();
	}
	
	public Bootcamp() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(LocalDate initialDate) {
		this.initialDate = initialDate;
	}

	public LocalDate getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(LocalDate finalDate) {
		this.finalDate = finalDate;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public List<Mentoring> getMentoring() {
		return mentoring;
	}
	
	public List<Course> getCourse() {
		return course;
	}
}
