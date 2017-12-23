package Pack1AccessMod;

public class Pack1Calculator2 {
    
	public int num1cal2;
public static int num2cal2;
	
	public void method1cal2()
	{
		System.out.println("Pack1--> Cal2--> Method1 Addition: " + (num1cal2+num2cal2));
			
		
	}
	
	
	public static void main(String[] args) {
		
		Pack1Calculator2 obj2=new Pack1Calculator2();
		obj2.num1cal2=35;
		Pack1Calculator2.num2cal2=2;
		obj2.method1cal2();

	}

}
