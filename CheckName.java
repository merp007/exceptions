package except_Program;

public class CheckName {
public static void main (String [] args) {// throws NameException {
  String s="prem";
  System.out.println("start");
  try {
  if(s.startsWith("A")) {
	  System.out.println("It is StartWith");
  }
  else {
	 throw new NameException("Not Starts with A"); 
  }
  }
  catch(NameException n) {
	  n.printStackTrace();
  }
  System.out.println("end");
}
}
