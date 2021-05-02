package bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name="student")
public class Student {
    @Id
	private int rollNo;
	private String name;
	@Column(name="dept_name")
	private String dept;
	//private String addr;
	
	public Student(){}
	public Student(int rollNo, String name, String dept){
		this.rollNo=rollNo;
		this.name=name;
		this.dept=dept;
		//this.addr=addr;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	/*public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}*/
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept +  "]";
	}
	
	
	
}
