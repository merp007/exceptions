package except_Program;

public class UseLogin {
public static void main (String [] args) throws PasswordException {
	String p="182933";
	Login l=new Login();
	l.checkPassword(p);
	
}
}