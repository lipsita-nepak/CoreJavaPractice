package day7;

import java.util.Stack;

public class CollectionDemo {
	public static void main(String[] args) {
       Stack s = new Stack();
		Stack stack=new Stack();
		/*s.push("A");
		s.push("A"); //3
		s.push("B"); // 2
		s.push(null); // 1
		
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.search("A"));*/
       
          stack.push("A");
          stack.push("B");
          stack.push("C");  
          stack.push("A");
          
         /*"A" - 1
          ---
          "C" - 2
          ---
          "B" - 3
          ---
          "A" - 4*/
          
          System.out.println(stack.search("A"));// 1 (Offset value)
          System.out.println(stack.search("G"));
          System.out.println(stack.search("B"));
	}
}
