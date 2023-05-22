package except_Program;
import java.io.File;
import java.io.FileReader;
public class CheckMsg {
public static void main (String [] args) throws Exception{
	File f=new File("C:\\Users\\DELL\\Documents\\j.txt");
	FileReader fr=new FileReader(f);
	int temp=0;
	try {
	while((temp=fr.read())!=-1) {
		System.out.print((char)(temp));
	}
	}
	catch(Exception a) {
		System.err.println(a);
	}
}
}
