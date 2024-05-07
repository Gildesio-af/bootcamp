package bootcamp.entities;

public class Course extends Content{
	
	private Integer level;
	private Integer workload;
	
	public Course(String title, String description, Integer level, Integer workload) {
		super(title, description);
		this.level = level;
		this.workload = workload;
	}

	public Course() {}

	@Override
	public int computeXp(int xp) {
		return level * workload;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getWorkload() {
		return workload;
	}

	public void setWorkload(Integer workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course: " + this.title;
	}
	
	
}
