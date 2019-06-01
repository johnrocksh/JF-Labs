
/*1. De afișat primii 40 multipli ai cifrei 8 prin intermediul ciclurilor while, do while, for.
2. De afișat prin intermediul ciclului for următoarea secvență de caractere
`*`
`**`
`***`
`****`
`*****`
*/

class WhileFor{
	
	public static void main(String[] arg){
	int counter=1;
	int multipliResult;
    
	System.out.println("Primii 40 multipli ai cifrei 8 prin intermediul ciclurilor WHILE");
	System.out.println("---------------------------------");
	 
	 while(counter<=40){
		multipliResult=8*counter;
		System.out.println(counter+". 8*"+counter+"="+multipliResult);		
		 
	counter++;	 
	 }
		
	System.out.println("Primii 40 multipli ai cifrei 8 prin intermediul ciclurilor FOR");
	System.out.println("---------------------------------");
	 
	
	for(int i=1;i<=40;i++){
	
		multipliResult=8*i;
		System.out.println(i+". 8*"+i+"="+multipliResult);		
	}	
	
	System.out.println("Primii 40 multipli ai cifrei 8 prin intermediul ciclurilor DO WHILE");
	System.out.println("---------------------------------");
	 
	
	counter=1;
	do{
		multipliResult=8*counter;
		System.out.println(counter+". 8*"+counter+"="+multipliResult);
		counter++;
		
	}while(counter<=40);
	
	
	
	
	String str="";
	for(int i=0;i<5;i++){
		str+="*";
	System.out.println("'"+str+"'");	
		
	}
	
}
}