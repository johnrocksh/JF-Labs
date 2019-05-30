import java.util.Scanner;

class LearningSwitch{
	public static void main(String[] arg){
		
		char consanaSauVocala;
		        
				Scanner sc=new Scanner(System.in);
				
				while(true){
					
					System.out.println("Please enter the character From A to Z:");
					System.out.println("Enter 'Q' to Exit.");
					
				consanaSauVocala=sc.next().charAt(0);
				
				
				switch(consanaSauVocala){
					
					case ('A'):
					System.out.println("A:vocala");
					break;
					
					case ('B'):
					System.out.println("B:consala");
					break;
					
					case ('C'):
					System.out.println("C:consala");
					break;
					
					case ('D'):
					System.out.println("D:consala");
					break;
					
					case ('E'):
					System.out.println("E:vocala");
					break;
					
					case ('F'):
					System.out.println("F:consala");
					break;
					
					case ('J'):
					System.out.println("J:consala");
					break;
					
					case ('H'):
					System.out.println("H:consala");
					break;
					case ('K'):
					System.out.println("K: consala");
					break;
					case ('L'):
					System.out.println("L:consala");
					
					case ('M'):
					System.out.println("M:consala");
					break;
					
					case ('N'):
					System.out.println("N:consala");
					break;
					
					case ('O'):
					System.out.println("O:vocala");
					break;
					
					case ('Q'):
					System.exit(0);
					
					default:
					System.out.println("Worning! Please try again....");
					
				}
					
				}
				
	}
		
	
	
	
	
	
}
