package day2;

public class ArrayDemo {
	public static void main(String[] args) {
		int j = 10;
		long l1 = j;
		System.out.println(j);//10
		System.out.println(l1);//10
		
		float f = 10.43f;
		int y =(int)f;
		System.out.println(f);//10.43
		System.out.println(y);//10
		
		Employee emp1 = new Employee(1001, "Ram");
		Employee emp2 = new Employee(1002, "Sam");
		Employee emp3 = new Employee(1003, "Usha");
		
		Employee[] empArr = new Employee[5];
		Employee []empArr1 = new Employee[5];
		Employee empArr2[] = new Employee[5];
		
		Student std1 = new Student(100, "Ravi");
		Student std2 = new Student(101, "Kavitha");
				
		Object[] objArr = new Object[7]; 
		objArr[0] = emp1;
		objArr[1] = emp2;
		objArr[2] = emp3;
		objArr[3] = std1;
		objArr[4] = std2;
		
		for(Object obj : objArr) {
			System.out.println(obj);//hash code
			if(obj instanceof Employee) {
				Employee emp = (Employee)obj;
				System.out.print(emp.empId + " ");
				System.out.print(emp.empName);
				System.out.println();
			} else if(obj instanceof Student) {
				Student std = (Student)obj;
				System.out.print(std.rollNo + " ");
				System.out.print(std.name);
				System.out.println();
			} else {
				System.out.println(obj);
			}
		}
		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30 ;
		
		// initialization
		empArr[0] = emp1;
		empArr[2] = emp2;
		empArr[4] = emp3;
		
		// Iterating through an array
		
		for(Employee emp:empArr) {
			System.out.println(emp); // hash code
			if(emp instanceof Employee) {
				//continue;
				System.out.print(emp.empId+" ");
				System.out.print(emp.empName);
				System.out.println();
				
			} else {
				System.out.println(emp);
			}
		}
		
		
		for(int i = 0 ; i<empArr.length ; i++) {
			if(empArr[i] instanceof Employee) {
				continue;
			} else {
				System.out.println(i);
			}
		}
	}


	}

