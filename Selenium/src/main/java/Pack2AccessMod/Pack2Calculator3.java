package Pack2AccessMod;

import Pack1AccessMod.Pack1Calculator1;
import Pack1AccessMod.Pack1Calculator2;

public class Pack2Calculator3 {
	
	
	int num1cal3;
	int num2cal3;
	
	void method1cal3()
	{
		System.out.println("Pack2--> Cal3--> Method1 Division : " + (num1cal3/num2cal3));
		
	}
	public static void main(String[] args) {
		
		Pack2Calculator3 obj4=new Pack2Calculator3();
		obj4.num1cal3=40;
		obj4.num2cal3=4;
		obj4.method1cal3();
		
		Pack1Calculator2 obj5=new Pack1Calculator2();
		obj5.num1cal2=10;
		obj5.method1cal2();
		
		Pack1Calculator1 obj6=new Pack1Calculator1();
		obj6.num1cal1=7;
		obj6.method2cal1();
		
	}

}
