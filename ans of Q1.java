import java.util.Scanner;

	
class staff{
public static	int code;
public static	String name;
	void get(){
Scanner in = new Scanner(System.in);
		System.out.print("enter the name of the staff: ");
		name=in.nextLine();
		System.out.print("enter the code of the staff: ");
		code=in.nextInt();
		
	}
	void display()
	{
		System.out.println(name+" is a stuff whose code no is "+code);
	}
}
class teacher extends staff
{
	String subject,publication;
	
	void get()
	{
		super.get();
	Scanner in = new Scanner(System.in);
		System.out.print("enter the subject of the teacher: ");
		subject=in.nextLine();
		System.out.print("enter the publication of the teacher: ");
		publication=in.nextLine();
	}
	void display()
	{
		System.out.println(name+" is a stuff whose code no is "+code+" is a teacher of subject "+this.subject+" and publication "+this.publication);
	}
}
class typist extends staff
{
	public static int speed;

	void get()
	{
		super.get();
	Scanner in = new Scanner(System.in);
		System.out.print("enter the speed of the typist: ");
		speed=in.nextInt();
		
	}
	void display()
	{
		System.out.println(name+" is a stuff whose code no is "+code+" is a typist of speed "+this.speed);
	}
}

class officer extends staff
{
	int grade;
	
	void get()
	{ 
		super.get();
	Scanner in = new Scanner(System.in);
		System.out.print("enter the grade of the officer: ");
		grade=in.nextInt();
		
	}
	void display()
	{
		System.out.println(name+" is a stuff whose code no is "+code+"is a officer of grade "+this.grade);
	}
}
class regular extends typist
{
	void get(){
		super.get();
	}
	void display()
	{
		System.out.println(name+" is a stuff whose code no is "+code+" is a reglar typist of speed "+speed);
	}
}
class casual extends typist
{ int wages;

 Scanner in = new Scanner(System.in);
void get()
{ 
	
		super.get();
		System.out.print("enter the daily wages of the casual typist: ");
		wages=in.nextInt();
}
void display()
	{
		System.out.println(name+" is a stuff whose code no is "+code+" is a casual typist of speed "+speed+" and his daily wages is "+this.wages);
	}
	
}

class test4 
{
	public static void main(String[] args){
		regular partha=new regular();
		 partha.get();
		 partha.display();
	}
}