package day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
File f = new File("C:\\Filehandling\\myjavafile.txt"); // anykind of file management opeartions
f.createNewFile();
FileWriter fw = new FileWriter(f);
BufferedWriter bw = new BufferedWriter(fw);
bw.write("Hi");
bw.newLine();
bw.write("Hello");
bw.newLine();
bw.close();
FileReader fr = new FileReader(f);
BufferedReader br = new BufferedReader(fr);
String str =null ;
while((str = br.readLine())!=null) {
System.out.println(br.readLine());
}

}catch(Exception e) {
	e.printStackTrace();//prints original exception
	System.out.println(e.getMessage()); //gives the message from the class
	System.out.println("There is an exception"); //userdefined exception
    throw new IOException("This is my exception");
}
	}

}
