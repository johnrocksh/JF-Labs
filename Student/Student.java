import java.util.Scanner;//подключаем для ввода данных с консоли
import java.io.IOException;//для очистки экрана


public class Student{

       public  String name;
       public String city;
       public  int    age;
		Student[] StudentList=new Student[5];
		static byte studentCounter=0;
		
      
	  
	  
	  
	  
      
      public Student(String name,String city,int age){//êîíñòðóêòîð
	    
		this.name=name;
		this.city=city;
		this.age=age;

	}
	
	

//////////////PressEnyKey  -- ожидаем нажатие любой клавиши от пользователя
  public void PressEnyKey(){

  //String str;
  //      Scanner sc = new Scanner(System.in);
  //      while (sc.hasNext("\n")){
  //          str = sc.nextLine();
  //      }
   
    Scanner in = new Scanner(System.in);
          char c = in.next().charAt(0);
          
  }

//////////////ClearDisplay
  public void ClearDisplay() {

     try {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    } catch (IOException | InterruptedException ex) {}
  }

////////////// Menu  -   âûâîäèì ìåíþ íà ýêðàí
    public void Menu(){
     
      
         System.out.println(" 1 : Add new Student ");
         System.out.println(" 2 : Delete Student");
         System.out.println(" 3 : Show all Students");
         System.out.println(" 4 : Find Student");
	     System.out.println(" 5: Exit");
     }
    
//////////////// 
 public void AddNewStudent(){
	
      Scanner scanName = new Scanner(System.in);
	  Scanner scanCyti = new Scanner(System.in);
	  Scanner scanAge = new Scanner(System.in);
     
	 
	 System.out.println(" ---------------- Add new Student ----------------- ");
	 System.out.println("Now count of student list is:"+studentCounter);
	 
	 
	 if(studentCounter<StudentList.length){//если мы не достигли предела нашеко списка то добавляем нового студента
	 
	 System.out.print("Enter  student name:");
	 
	 String name = scanName.next();
	 
	 System.out.print("Enter city:");
	 String city=scanCyti.next();
	 
	 System.out.print("Enter age");
	 try{
	 int age=scanAge.nextInt();
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error! Incorrect age... Please enter correct age data////");
	     AddNewStudent();//вызываю рекурсивно функцию для повторного ввода 
	 }
	 
	 StudentList[studentCounter]=new Student(name,city,age);
	 System.out.println("# Student was added successfully!");
	 //System.out.println( StudentList[studentCounter].name+" "+StudentList[studentCounter].city+" "+StudentList[studentCounter].age);
	 
	 studentCounter++;//увеличиваем счетчик
	 }
	 else{
		 
		 System.out.println("Sorry :(   StudentList is Full!");
	 }
	 
	  	 
 }
 
 ////////////// Show StudentList
 public void ShowStudentList(){
	 
	 System.out.println("------------Begin of StudentList---------------");
	 
	 for(int i=0;i<studentCounter;i++){
		 System.out.println(i+":"+StudentList[i].name+"|"+StudentList[i].city+"|"+StudentList[i].age);
				 
	 }
	  System.out.println("------------ End of StudentList---------------");
	
	//for(int i=0;i<StudentList.length;i++){
		
	//	System.out.println(i+":"+StudentList[i].name+StudentList[i].city+StudentList[i].age);
	 		
	//}
	
	 
 }
	
/////////////// ExitMenu- выход из программы
	public void ExitMenu(){
		System.exit(0);
	}
	
/////////////// SwitchMenu - îñóùåñòâëÿåì âûáîð ïóíêòà ìåíþ 
   public int SwitchMenu(int menuNumber){

    switch(menuNumber){
         case 1:{
           
		   AddNewStudent();
           break;
           

	 }
         case 2:{
           System.out.println("  Delete Student");
           break;
           
	 }
         case 3:{
           ShowStudentList();
           break;
            
	 }
         case 4:{
           System.out.println(" Find Student");
           break;
            
	 }
         case 5:{
           System.out.println(" Exit");
		   ExitMenu();
           break;
            
           
	 } 
        
       }
return menuNumber;
}

////////////////// ShowMenu -  
   public  void ShowMenu(){
      
     int  menuNumber;
     boolean RunMenu=true;
 
      while(RunMenu){
       
	    Menu();//выводим менюшку
        System.out.println("");
        System.out.print("Please make you choice: ");
          
          //ввод с консоли пункта меню
     	  Scanner in = new Scanner(System.in);//cчитываем пункт меню в char проверяем если это число и если оно меньше длины нашего массмва
          char c = in.next().charAt(0);
          if(Character.isDigit(c)){
			  
			  menuNumber=Character.getNumericValue(c); //берем числовое значение от Char 
			  
			  if(menuNumber<=StudentList.length){
				  ClearDisplay();//очищаем экран 
				  SwitchMenu(menuNumber);
				  System.out.println("PressEnyKey...");//ожидаем нажатия клавиши  
                  PressEnyKey();				  
			  }
		  }
		  
		  ClearDisplay();//очищаем экран 

	}
}
      
////////////////////
	public static void main (String[] args) {

          Student s = new Student("John Rock","Arizona",38);
          s.ShowMenu();
	//System.out.println(s.name);

 }

}