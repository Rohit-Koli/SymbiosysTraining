package exceptionHandlingIntro;

public class Exception05 {
	public static void validator(String name,String pass,int id) {
		try {
			if(name.equals("abc")) {
				System.out.println("username validated ");
			}else {
				throw new UserNameValidatorException("Username not Valid ");
			}}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		try {
			if(pass.equals("123")) {
				System.out.println("Password Validated ");
			}else {
				throw new PasswordValidatorException("Password is Incorrect !");
			}}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		try {
			if(id==1) {
				System.out.println("ID is Validated ");
			}else {
				throw new IdValidatorException("ID is incorrect ");
			}}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Its a validator class ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="ab";
		String pass="12";
		int id=10;
		try {
			validator(name,pass,id);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
