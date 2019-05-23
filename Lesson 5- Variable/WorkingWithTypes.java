public class WorkingWithTypes {
	
	/*
	boolean, short, byte, int, long float, double, char și String
	*/
	 boolean endOfStudentList=false;//если достигнут конец списка то переключаем в true
	 boolean isActive = false;
     boolean isAlive = true;
	 boolean showMenu=true;// показываем меню пока true
	 boolean studentIsAbsent=true; //можно установить флаг в false если студент отсутствует и наоборот
	 
	 short YearOfBirth=1995;
	 short serialNumber=2555;
	 short Appartment=456;
	 short countOfStudents=2000;
	 short DayOfTheYear=233;
	 
	 byte Bloodtype = 3;
     byte GameLevel = 42;
	 byte StudentAge=19;
	 
	 
	 
	 int someNumber=40000;
	 int num111 = 0x6F; // 16-тиричная система, число 111
     int num8 = 010; // 8-ричная система, число 8
     int num13 = 0b1101; // 2-ичная система, число 13
	 int telMobile = 79_567_789;// 
     
	 long longNuber = 2147483648L;
	 long quantityOfStarsMilkyWay=200000000000L;
	 
	 
	 
	 float amount = 1.0000005F;
     float avalue = 0.0000004F;
     float result = amount - avalue;
	
	 
	 double pi= 3.1416;
     
	 double radius=4.3;
	 double AreaOfACircle=pi*radius*radius;
	 
	 
	char KeyESC=27;//выход из программы при нажатии ESC
	char UnicodeSymbol = '\u0066'; // Unicode
    char ASCIISymbol = 102;          // ASCII 
	char Symbol3='$';
	
	
	String Name="John"; 
	String Cost = "5$";
	String hello = "Hello...";
	String Probel= " ";
	String Separator="---";
	 
	 public static void main(String arg[]){}	
}