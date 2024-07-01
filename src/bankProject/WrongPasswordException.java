package bankProject;

public class WrongPasswordException extends RuntimeException{
	public WrongPasswordException(String msg) {
		super(msg);
	}
}
