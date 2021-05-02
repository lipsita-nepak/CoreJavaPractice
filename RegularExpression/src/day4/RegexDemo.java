package day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Pattern pattern1 =  Pattern.compile("[mM][rs]s?\\."); // define pattern
		Matcher matcher1 = pattern1.matcher("Ms.");
		Matcher matcher2 = pattern1.matcher("Mr.");// define input
	    
		if(matcher1.matches()) {
			System.out.println(matcher1.group());
		} else {
			System.out.println("Match not found in given input");
		} 
		if(matcher2.matches()) {
			System.out.println(matcher2.group());
		} else {
			System.out.println("Match not found in given input");
		} 
		
		/*if(matcher1.find()) {
			System.out.println(matcher1.group());
		} else {
			System.out.println("Match not found in given input");
		}*/
		
		
		/*Pattern pattern2 =  Pattern.compile("[0-8]{4}/s[0-9]{3}/s[0-9]{4}"); // define pattern
		Matcher matcher2 = pattern2.matcher("1800 123 1234"); // define input
	    
		if(matcher2.matches()) {
			System.out.println(matcher2.group());
		} else {
			System.out.println("Match not found in given input");
		} 
		
		if(matcher2.find()) {
			System.out.println(matcher2.group());
		} else {
			System.out.println("Match not found in given input");
		}*/
		
		
		/*Pattern pattern3 =  Pattern.compile("\\w{2}\\.\\w{3}\\s\\w{3}\\."); // define pattern
		Matcher matcher3 = pattern3.matcher("mr.and mrs."); // define input
	   
		if(matcher3.matches()) {
			System.out.println(matcher3.group());
		} else {
			System.out.println("Match not found in given input");
		} 
		
		if(matcher3.find()) {
			System.out.println(matcher3.group());
		} else {
			System.out.println("Match not found in given input");
		}*/
		
		/*Pattern pattern4 =  Pattern.compile(".*"); // define pattern
		Matcher matcher4 = pattern4.matcher("020-26231407"); // define input
	
		
		if(matcher4.matches()) {
			System.out.println(matcher4.group());
		} else {
			System.out.println("Match not found in given input");
		} 
		
		if(matcher4.find()) {
			System.out.println(matcher4.group());
		} else {
			System.out.println("Match not found in given input");
		}
		
		
		Pattern pattern5 =  Pattern.compile(".*"); // define pattern
		Matcher matcher5 = pattern5.matcher("+ 91 20 2623 1407 (International call rates applicable)"); // define input
	
		
		if(matcher5.matches()) {
			System.out.println(matcher5.group());
		} else {
			System.out.println("Match not found in given input");
		} 
		
		if(matcher5.find()) {
			System.out.println(matcher5.group());
		} else {
			System.out.println("Match not found in given input");
		}*/
		
		
		

	}
}
