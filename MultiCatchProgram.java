package except_Program;

public class MultiCatchProgram {
public static void main (String [] args) {
	System.out.println("start");
	try {
		String a[]= {"sun","moon","star","galaxy"};
		int b;
		System.out.println(a[6].charAt(9));
		System.out.println(Integer.parseInt(a[0]));
	}
	catch(ArrayIndexOutOfBoundsException a) {
		a.printStackTrace();
	}
	catch(IndexOutOfBoundsException i) {
		i.printStackTrace();
	}
	catch(RuntimeException r) {
		r.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	finally {
		System.out.println("thankyou");
	}
	System.out.println("end");
}
}
