package day5;

public class WrapperClassDemo {
	public static void main(String[] args) {
		int i = 10;
		Integer i1 = new Integer(i);
		Integer i2 = new Integer("10");
	
		System.out.println(i1.getClass().getName());
		System.out.println(i1);
		System.out.println((i2));
		System.out.println(i2.getClass().getName());
		
		System.out.println();
		float f = 10.0f;
		Float f1 = new Float(f);
		System.out.println(f1);
		System.out.println(f1.getClass().getName());
		
		Float f2 = new Float("10.0f");
		System.out.println(f2.getClass().getName());
		
	    Float f3 = Float.valueOf(10.05f);
		System.out.println(f3.getClass().getName());
		
		Character ch = Character.valueOf('a');
		System.out.println(ch.getClass().getName());
		
		Integer x = 10; // auto boxing - converting primitive to object type automatically
		System.out.println(x.getClass().getName());
		
		// Wrapper Object to primitive data type
		// xxxValue()
		
		int y = i1.intValue();
		float z = f1.floatValue();
		
		System.out.println(y);
		System.out.println(z);
		
		// auto unboxing - wrapper object to primitive
		int j = i2; 
		
		System.out.println(j);
		
		// Wrapper object to String
		String str1 = i1.toString();
		String str2 = i2.toString();
		System.out.println(str1+str2); //1010 
		
		// primitive to String
		int k = 10;
		String str = String.valueOf(k);
		System.out.println(str.getClass().getName());// String
		
		
		// String to primitive
		String str3 = "10";
		int m = Integer.parseInt(str3);
		System.out.println(m);
		
		

	}
}
