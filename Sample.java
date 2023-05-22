package except_Program;

public class Sample {
	public static void main (String [] args) {
		System.out.println("start");
		try {
			int a=10;
			int c[]= {1,2,3,4,5};
			int b=0;
			System.out.println(c[8]);
		}
//		catch (Exception a) {
//			// System.err.println("error occur");
//			System.err.println(a);
//			a.printStackTrace();
//		}
		finally {
			System.out.println("goob bye");
		}
		System.out.println("end");
	}

}
