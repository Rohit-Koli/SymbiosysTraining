package exceptionHandlingIntro;

public class IdValidatorException extends RuntimeException{
	public IdValidatorException(String msg) {
		super(msg);
	}
}
