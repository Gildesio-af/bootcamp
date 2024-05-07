package bootcamp.entities;

public abstract class Content {
	
	protected String title;
	protected String description;
	
	public Content(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	
	public Content() {
	}
	
	public abstract int computeXp(int xp);

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
