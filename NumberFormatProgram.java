package except_Program;

public class NumberFormatProgram {
public static void main (String [] args) {
	System.out.println("start");
	try {
		String s="as2";
		float a=Float.parseFloat(s);
	}
	catch (NumberFormatException p) {
		System.out.println(p);
	}
	System.out.println("end");
}
}
