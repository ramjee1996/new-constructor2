package constructor2;

public class Person2 
{
	private String name;
	private int age;
	//default constructor
	public Person2(){
	name ="raju";
	age=22;
	}
	//parameterized constructor
	public Person2(String s, int i)
	{
		name = s;
		age=i;
	}
	public void talk() {
		System.out.println("Hello iam"+ name);
		System.out.println("My age is"+age );
	}
	

	public static void main(String[] args) {
		Person2 p1 =new Person2();
		p1.talk();
		Person2 p2 = new Person2("Sita", 20);
		//call the talk() method
		p2.talk();	
		}
}