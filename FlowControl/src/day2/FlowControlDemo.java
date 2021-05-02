package day2;

public class FlowControlDemo {
	    int ovalCount = 5;
		int consCount = 10;
		int x = 100;
		static int y = 200;

		void m1() {
			System.out.println(ovalCount); // 5
			System.out.println(consCount); // 10
			System.out.println(x); // 500
			System.out.println(y); // 1000
		}

		int getOvalCount(char[] chArr) {
			int count = 0;
			for (char c : chArr) { ;//{ 'a', 'e', 'i', 'o', 'u', 'x', 'y' };
				switch (c) {
				case 'a':
					count += 1;
					break;
				case 'e':
					count += 1;
					break;
				case 'i':
					count += 1;
					break;
				case 'o':
					count += 1;
					break;
				case 'u':
					count += 1;
					break;
				}// switch
			}// for
			return count;
		}

		public static void main(String[] args) {
			char[] chArr = { 'a', 'e', 'i','b','i', 'o', 'u', 'x', 'y' };
			FlowControlDemo fd = new FlowControlDemo();
			System.out.println("Oval Count: "+fd.getOvalCount(chArr));//oval count:6
			
			
			
			
			System.out.println(fd.x); // 100
			System.out.println(y); // 200
			fd.x = 500;
			y = 1000;
			System.out.println(fd.x); // 500
			System.out.println(y); // 1000

			int[] arr = { 5, 10, 15, 20, 25, 30 }; // index - starts from 0 - (length-1)

			
			  int[] arr1 = new int[10];
			  
			  int[] arr2 = new int[] {5, 10, 15};
			  
			  String[] strArr = {"Hi", "Hello"};
			  
			  System.out.println(arr.length);//6 
			  System.out.println(arr[0]);//5
			  System.out.println(arr[1]);//10 
			  System.out.println(arr[2]);//15
			  
			  for(int i =0; i<arr2.length;i++ ) { 
				  System.out.println(i); // 0, 1, 2
			      System.out.println(arr2[i]);// 5, 10, 15 }
			  }
			  for(int a:arr) { 
				  System.out.println(a); 
				  System.out.println(a*a); 
			  }
			  
			  for(String str:strArr) { 
				  System.out.println(str); 
			  }
			  
			  for(int a:arr1) { 
				  System.out.println(a); 
			}
			  
			  for(int a:arr) { 
				  System.out.println(a); 
			         if(a%2!=0) { 
			        	 System.out.println(a); 
			         }
			 }
			  
			  // print element which are present in odd index positions
			 
			//while
			int count = 0;
			while (count < arr.length) {
				;// 0<6
				System.out.println(arr[count]); // arr[0]
				count = count + 1;
			}

			
			 char ch = 'e';
			 int ovalCount=0; // local
			 int consCount=0; // local

			System.out.println("ovalCount: " + fd.ovalCount); //oval count=5
			System.out.println("consCount: " + fd.consCount); //cons count=10
			System.out.println();
			
			System.out.println("ovalCount: " + ovalCount); // local oval count=0
			System.out.println("consCount: " + consCount); //local cons count=0
			
			System.out.println();
			fd.m1(); // global
			

		}// main

	}// class


