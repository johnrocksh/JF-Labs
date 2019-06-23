


package student;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;//подключаем для ввода данных с консоли
import java.io.IOException;//для очистки экрана
import java.io.FileInputStream;


public class FileStudentList{
	String path="StudentList.txt";
	
	
	
	public void ParsingStudentLine(String studentLine){
		
			
		
	}
	
	public String GetStudentListFromFile(String path){
	
		
	String line="";
	String FileStudentList="";
	try{
			FileReader input=new FileReader(path);
			BufferedReader reader=new BufferedReader(new FileReader(path));
		    
			try{
				
				while((line=reader.readLine())!=null){
				 
				 ParsingStudentLine(line);
			 }
			 
			} 
			catch(IOException e){
				 
				 System.out.println("IOException!!!");
			 }
			 
	}
	catch(Exception e){
		System.out.println("File Not Found!!!");
		
	}
 
	System.out.println(FileStudentList);
	return FileStudentList;	
	}
	
	
	
	
	
}