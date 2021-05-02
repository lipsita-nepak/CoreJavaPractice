package day2;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1.capacity()); // 16
		sb1.ensureCapacity(20);
		System.out.println(sb1.capacity()); // 34
	
		// StringBuilder with string literal
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb2.capacity()); //16+3 = 19
		sb2.append("abcabcabcabcabcabc");
		System.out.println(sb2.capacity()); // (19*2)+2 =40
		
		
		

	}

}
