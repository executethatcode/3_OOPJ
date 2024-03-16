package com.employee.data;

public class EmpoloyeeData {
	public void getIncreement(String name, float salary, int exp)
	{
		long inc = (long) (salary *(.028f));
		System.out.println("Hi " + name + " Congratulation on completing " + exp + " years in the organisation" + " your increement is 	: " + inc);
	}
	
	public void getIncreement(String name)
	{
		long inc = 780;
		System.out.println("Hi " + name + " Congratulation on your first anniversary in the organisation" + " your increement is 	: " + inc);
	}
	
	public void getIncreement(String name, int salary, float exp)
	{
		long inc = (long)(salary * .028f);
		System.out.println("Hi " + name + " Congratulation on completing " + exp + " years in the organisation" + " your increement is 	: " + inc);
	}
	
	public void getIncreement(float salary,String name, int exp)
	{
		long inc = (long)(salary * .028f);
		System.out.println("Hi " + name + " Congratulation on completing " + exp + " years in the organisation" + " your increement is 	: " + inc);
	}
}