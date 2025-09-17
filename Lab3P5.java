import java.util.Scanner;
class Lab3P5{
	public static void main(String...args){
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		String b=s.next();
	// Constructer Overloading
		Lab3P5 l=new Lab3P5();
		Lab3P5 l1=new Lab3P5(a);
		Lab3P5 l2=new Lab3P5(b);
		Lab3P5 l3=new Lab3P5(a,b);
	//Method Overloading
		l.show();l1.show(a);l2.show(b);l3.show(a,b);
	}
	//---------Constructor Overloading
	Lab3P5(){
		System.out.println("Constructor without params:");
	}
	Lab3P5(int x){
		System.out.println("Constructor with int params:"+x);
	}
	Lab3P5(String s){
		System.out.println("Constructor with string params:"+s);
	}
	Lab3P5(int x,String s){
		System.out.println("Constructor with two params int and string:"+x+ " "+s);
	}	
	//--------------methods(Overloading)	

	public void show(){
		System.out.println("Method without params");
	}
	public void show(int x){
		System.out.println("Method with params:"+x);
	}
	public void show( String s){
		System.out.println("Method with string params:"+s);
	}
public void show(int x,String s){
		System.out.println("Method with two  params int and string:"+x+" "+s);
	}
}