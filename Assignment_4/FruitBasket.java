
import java.util.Scanner;
abstract class  Fruit{
	protected String color;
	protected double weight ;
	protected String name;
	protected boolean isFresh;
	public void Fruit(String color, double weight, String name, boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	Scanner sc=new Scanner(System.in);
	void acceptRecord() {
		System.out.println("Enter Name :");
		name=sc.nextLine();
		System.out.println("Enter color");
		color=sc.nextLine();
		System.out.println("Enter Weight :");
		weight=sc.nextDouble();
		System.out.println("Enter is Fresh or Not");
		isFresh=sc.nextBoolean();
		}
	void Diaplay() {
		System.out.println("Name :"+name);
		System.out.println("color :"+color);
		System.out.println("Weight :"+weight);
		System.out.println("Fresh :"+isFresh);
	}
	public String toString(){
		return "[name :"+name+"color :"+color+"weight :"+weight+"]";
	}
	public abstract String taste();
}
class Apple extends Fruit{
	
	public String taste() {
		return "sweet and sour";

	}
}
class Mongo extends Fruit{
	public String taste() {
		return "sweet ";

	}
}
class Orange extends Fruit{
	public String taste() {
		return "sour";

	}

}

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size :");
		int size=sc.nextInt();
		Fruit[] f=new Fruit[size];
		int choice;
		int n=0;
		
	 do {
		 System.out.println("0.EXIT");
		 System.out.println("1.add Mango  ");
		 System.out.println("2.add Oranges ");
		 System.out.println("3.add Apple ");
		 System.out.println("4.display all Fruits in basket ");
		 System.out.println("5.Display name, color, weight, taste of all fresh fruits");
		 System.out.println("6.Display tastes of all stale (not fresh) fruits in the basket");
		 System.out.println("7.Mark a fruit asstale i/p : index");
		 System.out.println("8.  Mark allsour fruitsstale (optional)");
		 System.out.println("Enter your choice ");
		 choice=sc.nextInt();
		 switch(choice) {
		 case 1:
		 {
			 f[n]=  new Mongo();
			 f[n].acceptRecord();
			 n++;
		 }
		 break;
		 case 2:
		 {
			 {
				 f[n]=  new Orange();
				 f[n].acceptRecord();
				 n++;
			 }
		 }
		 break;
		 
		 case 3:
		 {
			 {
				 f[n]=  new Apple();
				 f[n].acceptRecord();
				 n++;
			 }
		 }
		 break;
		 
		 case 4:
		 {
			 for(int i=0;i<f.length;i++) {
				 if(f!=null)
				 System.out.println(f[i].getName());
				
			 }
		 }
		 break;
		 case 5:
	     {
	    	 for(int i=0;i<f.length;i++) {
				 f[i].Diaplay();
	     }
		 }
	     break;
		 case 6:
		 {
		 	 for(int i=0;i<f.length;i++) {
		 		 if(f!=null && !f[i].isFresh)
	     	 System.out.println( f[i].taste());}
		 }
		 break;
		 case 7:
		 {
			System.out.println("Enter the index ");
			int index= sc.nextInt();
			if(index>0 && index<f.length) {
				f[index].isFresh=false;
			}
			else {
				System.out.println("Invalid Index !");
			}
		 }
		 break;
		 case 8:
		 {
			 for(int i=0;i<f.length;i++) {
				 String str="sour";
				 if(str.equals(f[i].taste())) {
					 f[i].isFresh=false;
				 }
			 }
		 }
		 break;
		 
		 }
	 }while(choice!=0);
	}

}
