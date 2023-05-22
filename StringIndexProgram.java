package except_Program;

public class StringIndexProgram {
public static void main (String [] args) {
	System.out.println("start");
	try {
		 String s="123prem";
		 System.err.println(s.charAt(11));
	}
	catch (StringIndexOutOfBoundsException a) {
		System.out.println(a);
	}
	System.out.println("end");
}
}
