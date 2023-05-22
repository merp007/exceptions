package except_Program;

public class ArithmeticProgram {
public static void main (String [] args) {
	System.out.println("start");
	int n1=98;
	int n2=0;
	try {
	System.out.println(n1/n2);
	}
	catch(ArithmeticException a) {
		System.out.println("error occur");
	}
	System.out.println("end");
	
}
}
