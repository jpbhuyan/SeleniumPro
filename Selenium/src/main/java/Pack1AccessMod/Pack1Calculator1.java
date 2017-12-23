package Pack1AccessMod;

public class Pack1Calculator1 {

	public int num1cal1;
	public final int num2cal1=5;
	
	void method1cal1()
	{
		System.out.println("Pack1--> Cal1--> Method1 Substraction : " + (num1cal1-num2cal1));
	}
	
	public void method2cal1()
	
	{
		System.out.println("Pack1--> Cal1--> Method2 Multiplicatoin: " + (num1cal1*num2cal1));
	}
	
	public static void main(String[] args) {
		
		Pack1Calculator1 obj1=new Pack1Calculator1();
		obj1.num1cal1=20;
		
		obj1.method1cal1();
		obj1.method2cal1();
		
		
		Pack1Calculator2 obj3=new Pack1Calculator2();
		obj3.num1cal2=30;
		Pack1Calculator2.num2cal2=2;  //Calling Static variable
		obj3.method1cal2();

	}

}
