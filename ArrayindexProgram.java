package except_Program;

public class ArrayindexProgram {
public static void main (String [] args) {
	System.out.println("start");
	try {
		 char a[]= {'a','c','d','f'};
		 System.out.println(a[9]);
	}
	catch (ArrayIndexOutOfBoundsException i) {
		i.printStackTrace();
	}
	System.out.println("end");
}
}
