package except_Program;

public class NullPointerProgram {
public static void main (String [] args) {
	System.out.println("start");
	try {
		String a=null;
		System.out.println(a.charAt(0));
	}
	catch (NullPointerException n) {
		n.printStackTrace();
		//System.out.println(n);
	}
	System.out.println("end");
}
}
