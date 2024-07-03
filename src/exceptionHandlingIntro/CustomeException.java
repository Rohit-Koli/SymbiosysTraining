package exceptionHandlingIntro;

public class CustomeException extends RuntimeException{
	public CustomeException(String msg) {
		super(msg);
	}
}
