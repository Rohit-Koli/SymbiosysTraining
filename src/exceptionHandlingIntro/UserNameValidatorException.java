package exceptionHandlingIntro;

public class UserNameValidatorException extends RuntimeException{
	public UserNameValidatorException(String msg) {
		super(msg);
	}
}
