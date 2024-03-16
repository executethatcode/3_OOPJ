package com.employee.main;
import com.employee.data.*;

public class EmployeeMain {
	public static void main(String[] args) {
	EmpoloyeeData eData = new EmpoloyeeData();
	eData.getIncreement("Ravi",56780.87f,5);
	eData.getIncreement("Geeta",45000,6.5f);
	eData.getIncreement("Sundeep");
	eData.getIncreement(56780.87f, "C P",5);
	}

}
