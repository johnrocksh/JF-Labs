/*
2. Intr-un fisier java separat LearningWhile, afisati prin intermediul unui ciclu `while` primele 100 numere (0-100)
2.2 In acelasi fisier, printr-un ciclu while, afisati toate numere pare intre 0 si 50
2.3 In acelasi fisier printr-un ciclu while afisati numere impare intre 50 si 100
*/

class LearningWhile{
	
	public static void main(String[] arg){
		int numere=0;
		int numerePar=0;
		int numereImpar=50;
		
		
		while(numere<=100){
			
			//if(numere%2==0)System.out.println("numere="+numere+" (PARE)");
			//else
			//System.out.println("numere="+numere+" (imPARE)");
		    System.out.println("numere="+numere);
			numere++;
		}
		
		while(numerePar<=50){
			
			if(numerePar%2==0) System.out.println("numerePar="+numerePar+" (PARE)");	
			
			numerePar++;
		}
		
		while(numereImpar<=100){
			
			if(numereImpar%2>0) System.out.println("numereImpar="+numereImpar+" (imPARE)");
			numereImpar++;
			
		}
		
		
	}
	
}



