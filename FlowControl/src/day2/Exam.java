package day2;

public class Exam {
public static void main(String[] args) {
	int a,b;
	
	a=10;
	b=(a==1)?20:30;
	System.out.println(b);
	b=(a==10)?20:30;
	System.out.println(b);
	
	String s1="true";
	String s2=new String(s1);
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.equals(s2));
	System.out.println(s1==s2);
}
}
