/*1. De creat 20 de clase pentru 20 de obiecte luate din viața reală.

Fiecare clasă trebuie să aibă 3 atribute ce o caracterizează și 3 metode care îi definesc acțiunile
Sugestii referitoare la testul de luni vor fi postate un pic mai târziu.
Preventiv, temele abordate vor fi: tipuri de date, operatori,  blocuri decizionale if/switch
*/


class Family{
	
	private String mama;
	private  String papa;
	private int children;
	
	public String printMama(){System.out.println("mama="+mama);return mama;}
	public	String printPapa(){System.out.println("papa="+papa);return papa;}
	public	int printChildren(){System.out.println("children="+children);return children;}
	
	Family(String mama,String papa,int children){

		this.mama=mama;
		this.papa=papa;
		this.children=children;
		
	}
	
}	
	
class Child{
	
	private String nameChild;
	private String polChild;//мужской или женский
	private int ageChild;
	private String hobbyChild;
	
	public void printName(){
		
		System.out.println("name of child is:"+nameChild);
	};
	public void printPol(){
		
		System.out.println("pol of child:"+polChild);
		
	};
	public void printAge(){
		
		System.out.println("age of child is:"+ageChild);
	};
	
	public void printHobby(){
		System.out.println("Hobby of cild is"+hobbyChild);
	}
	
	Child(String nameChild,String polChild,int ageChild,String hobbyChild){
		this.nameChild=nameChild;
		this.polChild=polChild;
		this.ageChild=ageChild;
		this.hobbyChild=hobbyChild;
		
	}
	
	
}
	
class houseFamily{
	
	int floor;//этаж
	int rooms;//сколько комнат
	int square;//площадь
	
	void printFloor(){
		
		System.out.println("floor is:"+floor);
	}
	void printRooms(){
		System.out.println("count of rooms is:"+rooms);
		
	}
	void printSquare(){
		System.out.println("square is:"+square);
		
	}
	
	houseFamily(int floor,int rooms, int square){
		this.floor=floor;
		this.rooms=rooms;
		this.square=square;	
	}
	
}	
// 4 class Car	
class Car{
	
	String marka;
	String model;
	String color;
	int    yearOfIssue;
	
	
	void GoStrait(){}
	void ternRight(){}
	void ternLeft(){}
	void GoBack(){}
}

//5 class PlayerMp3

class PlayerMp3{
	
	 private int height;
	 private int with;
	 private int length;

	 void Play(){}
   	 void Stop(){}
	 void Pause(){}
	
}

//6 class Bankomat

class Bankomat{
	
	String bankName;
	String adress;
	boolean Cashin;//
	
	public void  GetMoney(){}
	public void GiveMoney(){}
	public void  PrintСheck(){}
	public void ShowRest(){}
	
}

//7 class  WashingMachine

class WashingMashine{
	
 
 int weight;
 int capacity;
 int power; 
 
 public void Wash(){}
 public void Dry(){}
 public void Flush(){}
	
}

//8 RollerSkates

class RollerSkates{
    byte numberOfWheels;
	boolean sizeСhanges;
	String typeOfBrakes;

	public void RollerSkatesShoozeOn(){}
	public void RollerSkatesShoozeOf(){}
	public void RollerSkatesGo(){}
	public void RollerSkatesStop(){}
	
	
}

//9 BookReader

class BookReader{
	float sizeDiogonal;
	float thickness;
    float weight;

	public void openBook(){}
	public void closeBook(){}
	public void pageDown(){}
	public void pageUp(){}
	public void goToPage(){}
}


//10 Router

class Router{
	
	String name;
	String type;
	boolean wan;
	String protokol;
	
	 void Reset(){}
     void PowerOnOff(){}
	 void OnOff(){}
	 
	
}

//11  AlarmClock

class AlarmClock {
	private String date;
	private String time;
	private boolean repeat;
	
	void SetAlarm(){}
	void ResetAlarm(){}
	void AddNewAlarm(){}
	
}

//12 Apteka

class Apteka{
	
private	int ammoutnOfMedicine;
private    double soldForSum;
private	double profit;
	
void ToSell(String nameOfMedicine,int count,double price){}
void ToBY(String nameOfMedicine,int count,double price){}
double ProfitCalc(){return profit;}
	
	
}


//13 notepad

class Notepad{
	
	String fileName;
	String folderName;
	String path;
	
	void CreateNewFile(){}
	void OpenFile(){}
	void SaveFile(){}
	
}

//14 simuliator

class Simuliator{
	
	String name;
	int Skin;
	String sex;
	
	
	void GoStraight(){}
	void GoLeft(){}
	void GoRight(){}
	void Back(){}
	
	
}

//15  class 

class Webmoney{
	
	double balance;
	String name;
	String password;
	
	void ShowBalance(){}
	void PutMoney(){}
	void ToBuySomething(){}
	
}


//  16 class PCOff


class Vicliucatel{
	String time;
	boolean OnOff;
	
	void SetTime(){}
	void VicliucatelOn(){}
	void VicliucatelOf(){}
	
}


// 17 class cikirikitanga

class cikirikitanga{
	int shtanga1;
	int shtanga2;
	int shtanga3;
	
	void CineRupeShtanga1(){}
	void CineRupeShtanga2(){}
	void CineRupeShtanga3(){}
	
}

//18 class school
class school {
 int countOfpupil ;
 int boys;
 int girls;
 
 void AddPupil(){}
 void DelPupil(){}
 void EditPupil(){}
	
	
}

//19 day

class Day{
	
boolean morning;
boolean dinner;
boolean evening;

void SetMorning(){}
void SetDinner(){}
void SetEvening(){}
	
	
}

//20 weather
class Weather{
	boolean clear;
	boolean cloudy;
	boolean rain;
	
	void  SetCountry(){};
	void  SetCity(){}
	void  GetWeather(){};
	
}





class WorkingWithClass{
	
	public static void main(String[] arg){
		//1 class Family
		System.out.println("--------------1. Class:Family");
		System.out.println("");
		
		Family myFamily=new Family("John","Edlen",4);
		myFamily.printMama();
		myFamily.printPapa();
		myFamily.printChildren();
		
		//2 class Children
		System.out.println("--------------2. Class:Child");
		System.out.println("");
		
		Child  myChild=new Child("Gloria","female",11,"Art");
		myChild.printName();
		myChild.printPol();
		myChild.printAge();
		myChild.printHobby();
		
		//3 class houseFamily
		System.out.println("--------------3. Class:houseFamily");
		System.out.println("");
		
		houseFamily myHouseFamily=new houseFamily(2,3,55);
		myHouseFamily.printFloor();
		myHouseFamily.printRooms();
		myHouseFamily.printSquare();
		
		
	}
	
	
}