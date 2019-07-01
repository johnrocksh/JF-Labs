/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayexemple;

/**
 *
 * @author User
 */
public class ArrayExemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] firstArr= new int[1000] ;
        int counter=0;
      
        
       while(counter!=firstArr.length){
       firstArr[counter]=counter*2;
      System.out.println("firstArr["+counter+"]="+firstArr[counter]);
      counter++;
       }
       
       counter=999; 
       do{
       firstArr[counter]=counter*2;
       System.out.println("firstArr["+counter+"]="+firstArr[counter]);
       counter--;
       }
       while(counter!=0);
    }
    
}
