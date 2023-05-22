package except_Program;

public class Login {
public void checkPassword(String password) throws PasswordException{
	try
	{if(password.length()<8) {
		throw new PasswordException("password must contain more than 8 letters");
	}
	else {
		System.out.println("Login Successfully");
	}
	}
	catch (PasswordException e) {
		//e.printStackTrace();
		System.out.println(e);
	}
}
}
