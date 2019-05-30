/*
Declarati un bloc decizional switch, care afiseaza mesajul „Insuficient” pentru valori 1-5, 
"Satisfacator" pentru 6-7, "Bine" pentru 8-9, "Formidabil" - 10

*/


import java.util.Scanner;


class LearningSwitch2{
	public static final String ANSI_RED = "\u001B[31m";
	
	public static void main(String[] arg){
		
		int studentAssessment;
		  
       
				Scanner sc=new Scanner(System.in);
				
				while(true){
					System.out.println(" ");
					System.out.println("Please enter the studentAssessment From 0 to 10:");
					System.out.println("Enter '-1' to Exit.");System.out.println(" ");
					System.out.println("-----------------");
				try{
					studentAssessment=sc.nextInt();
					
				}
				catch(Exception  e)	{
					
					System.out.println("Exception! Please enter the digit from 0 to 10");
					sc.next();
					continue;
				}			
				
				
				
				switch(studentAssessment){
					
					case (0):
					System.out.println("Insuficient");
					break;
					case (1):
					System.out.println("Insuficient");
					break;
					case (2):
					System.out.println("Insuficient");
					break;
					case (3):
					System.out.println("Insuficient");
					break;
					case (4):
					System.out.println("Insuficient");
					break;
					case (5):
					System.out.println("Insuficient");
					break;
					
					case (6):
					System.out.println("Satisfactor");
					break;
					
					case (7):
					System.out.println("Satisfactor");
					break;
								
					case (8):
					System.out.println("Bine");
					break;
					
					case (9):
					System.out.println("Bine");
					break;
					
					case (10):
					System.out.println("Formidabil");
					break;
					
					case (-1):
					System.exit(0);
					
					default:
					System.out.println("Worning! Please try again....");
					
				}
					
				}
				
	}
		
	
	
	
	
	
}
