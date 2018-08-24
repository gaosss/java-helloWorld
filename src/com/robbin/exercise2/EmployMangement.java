//Employment manage system

//1、add new employee into the system
//2、show employee info according to the employee index
//3、show all the employee infos
//4、modify emplyee's salary
//5、delete employee info when needed
//6、sorting the employee according to salary
//7、calculate the average salary and provide the lowest one and the highest one



package com.robbin.exercise2;

import java.util.*;

public class EmployMangement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Management mgt = new Management();
		Scanner sr = new Scanner(System.in);
		
		
	
//		mgt.AddEmp(1, "Songjiang", 1000f, 50);
//		
//		System.out.println("一号员工的名字是"+ ((Employee)(mgt.getAl().get(0))).getEmployeeName() );
		//int i = 0;
		
		while (true) 
		{
			System.out.println("please select you options from 1 to 9");
			System.out.println("1、add some one into the system");
			System.out.println("2、show employee info according to index");
			System.out.println("3、show all the employee info");
			System.out.println("4、modify emplyee's salary according to index");
			System.out.println("5、delete emplyee's info according to name");
			System.out.println("6、sorting the employee according to salarye");
			System.out.println("7、calculate the average salary and provide the lowest one and the highest one");
			System.out.println("9、exit");
			
			int i = sr.nextInt();
			
			
			if (i == 9) 
			{
				System.exit(0);
			}
			
			if (i == 3) 
			{
				for (int j=0; j < mgt.getAl().size();j++) 
				{
					Employee emp = (Employee) mgt.getAl().get(j);
					System.out.println("员工姓名： "+ emp.getEmployeeName() + " 员工编号： " + (j+1) + " 年龄： " + emp.getAge() + " 薪水： " + emp.getSalary()); 
				}
				
			}
			
			if (i == 1) 
			{
				System.out.println("please input employee name:  ");
				String name = sr.next();
				System.out.println("please input employee age:  ");
				int age = sr.nextInt();
				System.out.println("please input employee salary:  ");
				float salary = sr.nextFloat();
				mgt.AddEmp(name, salary, age);				
			}
			
			if (i == 2) 
			{
				System.out.println("please input employee index:  ");
				int index = sr.nextInt();
				
				if (mgt.getAl().size() >= index) 
				{
					Employee emp =(Employee) mgt.getAl().get(index-1); 
					System .out.println(index + "号员工的信息如下： ");
					//Employee emp =(Employee) mgt.getAl().get(index-1); 
					System.out.println("Name: " + emp.getEmployeeName() + "      age : " + emp.getAge() + "      Salary : " + emp.getSalary());
				}
				else 
				{
					System .out.println("no entry available");
				}
			}
			
			if (i == 4) 
			{
				System.out.println("please input employee index who need to modify salary:  ");
				int index = sr.nextInt();
				if (mgt.getAl().size() >= index) 
				{
					Employee emp =(Employee) mgt.getAl().get(index-1); 
					System .out.println("please input the new salary");
					float sal = sr.nextFloat();
					emp.setSalary(sal);
					System .out.println("the new salary is :   " + emp.getSalary());
										
				}
				else 
				{
					System .out.println("no entry available");
				}
				
			}
			
			if (i == 5) 
			{
				System .out.println("please input the name which need to be deleted :  ");
				String name = sr.next();
				int indicator = 0;
				for (int j = 0; j < mgt.getAl().size(); j++)
				{
					Employee emp = (Employee) mgt.getAl().get(j);
					if (name.equals(emp.getEmployeeName()))
					{
						mgt.getAl().remove(j);
						
						indicator = 1;
						
					}
				}
				if (indicator == 1) 
				{
					System.out.println(name+"has been deleted");
				}
				else 
				{
					System.out.println("no entry available");
				}
				
				
			}
			
			if (i == 6) 
			{
				mgt.ShowinfoBaseonSalary();
			}
			
		}
		
		
		
	}

}

class Management
{
	private ArrayList al = null;
	//private ArrayList al_Salary =null;
	
	
	public ArrayList getAl() {
		return al;
	}

	public void setAl(ArrayList al) {
		this.al = al;
	}

	Management ()
	{
		al = new ArrayList();
	}
	
	public void AddEmp(String name, float sal, int age)
	{
		Employee emp = new Employee(name, sal, age);
		al.add(emp);
	}
	public void ShowinfoBaseonSalary()
	{
		int total = this.al.size();
		float sorting[] = new float[total];
		float tmp ;
		for (int i =0; i < total; i++) 
		{
			Employee emp = (Employee) this.al.get(i); 
			sorting[i] = emp.getSalary();
		}
		
		for (int i =0; i < total; i++) 
		{
			for (int j =1; j < total; j++)
			{
				if (sorting[j-1] > sorting[j])
				{
					tmp = sorting[j-1];
					sorting[j-1] = sorting[j];
					sorting[j] = tmp;
					
				}
			}
		}
		System.out.println ("Salary sorting is as below : ");
		for (int i = 0 ; i < total ; i++) 
		{
			
			System.out.println(sorting[i]);
		}
	
				
		
	}
}


class Employee
{
	

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	private String EmployeeName;
	private float Salary;
	
	Employee ( String name, float sal,int age)
	{
		
		this.EmployeeName = name;
		this.Salary = sal;
		this.age = age;
	
	}
	

}