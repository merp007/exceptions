package except_Program;

public class VoterAge {
public static void main (String [] args) throws AgeException {
	System.out.println("start");
	try {
	int age=15;
	if(age<18) {
		throw new AgeException("not eligible");
		
	}
	else {
		System.out.println("eligible");
	}
	}

	
	
	catch  (AgeException a) {
		System.out.println(a);
	}
	System.out.println("end");
	
	
}
}
