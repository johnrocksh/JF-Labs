/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithstring;

/**
 *
 * @author User
 */
public class WorkingWithString {

    /**
     * @param args the command line arguments
     */
    String toCountRepitedSymbolInString(String str){
    String repitedSymbols="";
    char ch,ch_pre;
    int counter=1;
   ch_pre=str.charAt(0);
   ch=str.charAt(1);
    
    for(int i=1;i<=str.length();i++){
   
       
        if(str.charAt(i-1)==str.charAt(i)){
        counter++;
        ch_pre=str.charAt(i-1);
        ch=str.charAt(i);
        
        }
        else{
        repitedSymbols+=ch+String.valueOf(counter);
         counter=1;   
         ch_pre=str.charAt(i-1);
         ch=str.charAt(i);
         if(i==str.length()-1){repitedSymbols+=ch+String.valueOf(counter);//если конец строки то я я выхожу 
         break;}
        
        }
    
    
    }
    
           return repitedSymbols;
    
    }
    
    
    String changeRegistr(String string){
    String changedString="";
     
   for(int i=0;i<string.length();i++){
    
   
     if(Character.isLowerCase(string.charAt(i))){//if simbol in small register 
     Character.toUpperCase(string.charAt(i));
     changedString+=Character.toUpperCase(string.charAt(i));
     }
     else
     if(Character.isUpperCase(string.charAt(i))){
     
     Character.toLowerCase(string.charAt(i));
     changedString+=Character.toLowerCase(string.charAt(i));
     }
       
   }
    return changedString;
    }
    
    
    
    
    String revers(String correctString) {
        String reversString = "";
        char[] charArrayString = new char[correctString.length()];

        int j = 0;

        for (int i = correctString.length() - 1; i >= 0; i--) {

            charArrayString[j] = correctString.charAt(i);

            reversString = reversString + charArrayString[j];
            j++;

        }

        return reversString;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        WorkingWithString wws = new WorkingWithString();
        System.out.println(wws.revers("1234567"));
        
        System.out.println(wws.changeRegistr("aKHjjjLJjjjJJ"));
        
        System.out.println(wws.toCountRepitedSymbolInString("wweeerrwwwvvbgfddsds"));
    }

}
