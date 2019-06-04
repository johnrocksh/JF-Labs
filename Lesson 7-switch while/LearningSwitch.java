import java.util.Scanner;

class LearningSwitch{
	public static void main(String[] arg){
		
		char consanaSauVocala;
		        
				Scanner sc=new Scanner(System.in);
				
				while(true){
					
					System.out.println("Please enter the character From A to Z:");
					System.out.println("Enter '1' to Exit.");
					
				consanaSauVocala=sc.next().charAt(0);
				char ch = Character.toUpperCase(consanaSauVocala);
				
				
				
				switch(ch){
					
					case ('A'):
					System.out.println("A:vocala");
					break;
										
					case ('E'):
					System.out.println("E:vocala");
					break;
					
					case ('O'):
					System.out.println("O:vocala");
					break;
										
					case ('U'):
					System.out.println("U:vocala");
					break;
						
					case ('Y'):
					System.out.println("Y:vocala");
					break;
					
					case ('I'):
					System.out.println("I:vocala");
					break;
					
							
					case (49):
					System.exit(0);
					
					default:
					System.out.println(ch+":consala");
					
				}
					
				}
				
	}
		
	
	
	
	
	
}
