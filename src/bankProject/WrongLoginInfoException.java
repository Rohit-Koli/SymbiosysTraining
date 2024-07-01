package bankProject;

public class WrongLoginInfoException extends RuntimeException{
	public WrongLoginInfoException(String msg) {
		super(msg);
	}
}
