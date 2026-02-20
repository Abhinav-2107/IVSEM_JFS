import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteNameToFile{
	public static void main(String[] args){
		System.out.println("Write your name");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	try{
		FileWriter obj = new FileWriter("student.txt");
		obj.write(s);
		obj.close();
		System.out.println("New file written");
	}
	catch(IOException e){
		System.out.println("An error occured");
		e.printStackTrace();
	}
	}
}