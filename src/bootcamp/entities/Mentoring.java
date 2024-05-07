package bootcamp.entities;

import java.time.LocalDate;

public class Mentoring extends Content{
	
	private LocalDate eventDate;

	public Mentoring(String title, String description, LocalDate eventDate) {
		super(title, description);
		this.eventDate = eventDate;
	}

	public Mentoring() {}

	@Override
	public int computeXp(int xp) {
		return 500;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}
}
