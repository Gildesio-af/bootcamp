package bootcamp.exceptions;

public class NoCourseException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public NoCourseException(String message) {
		super(message);
	}
}
