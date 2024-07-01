package exceptionHandlingIntro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CheckedExceptionIntro {
	
	public static void readFile(String path) throws FileNotFoundException{
		FileReader file = new FileReader(path);
		BufferedReader r2 = new BufferedReader(file);
		try {
			String txt=r2.readLine();
			System.out.println(txt);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void fileWrite(String path) throws FileNotFoundException{
		try {
			FileWriter fr = new FileWriter(path);
			BufferedWriter Fwrite = new BufferedWriter(fr);
			String data="Hello ROhit Hii";
			Fwrite.write(data);
			Fwrite.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\ROHIT\\eclipse-workspace\\SymbiosysTraining\\src\\exceptionHandlingIntro\\inputFile.txt";
		try {
			
			fileWrite(path);
			readFile(path);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("END");
		
		
	}

}
