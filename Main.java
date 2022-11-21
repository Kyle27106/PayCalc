
//University of Arizona Global Campus
//Kyle Younce
//CPT307: Data Structures & Algorithms
//Dr. Joshua Reichard
//7/26/2021

import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
			String employeeName;
			double rateofPay;
			int hoursWorked;
			
			//User Inputs
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Employee's Name: ");
			employeeName = sc.nextLine();
			
			System.out.print("Rate of Pay: ");
			rateofPay = sc.nextDouble();
			
			System.out.print("Hours Worked: ");
			hoursWorked = sc.nextInt();
		//Processing
			double grossPay;
			double overtimeWorked=0;
			
			if (hoursWorked <= 40) {
				grossPay=hoursWorked*rateofPay;
				
			}
			else {
				overtimeWorked=hoursWorked-40;
				grossPay=(overtimeWorked)*rateofPay*1.5 + 40*rateofPay;
			}
			
			// Deductions
			double federalTax = 15 / 100 * grossPay;
			double stateTax = 3.07 / 100 * grossPay;
			double medicare = 1.45 /100 * grossPay;
			double socialSecurity = 6.2 / 100 * grossPay;
			double unemploymentInsurance = .07 / 100 *grossPay;
			double totalDeductions = federalTax + stateTax + medicare + socialSecurity + unemploymentInsurance;
			
			double netPay = grossPay - totalDeductions; 
			
			//Output
			System.out.println("Employee Name: " +employeeName);
			System.out.println("Rate of Pay: " + rateofPay);
			System.out.println("Hours worked: " + hoursWorked);
			System.out.println("Overtime Worked: " + overtimeWorked);
			System.out.println("Gross Pay: " + grossPay);
			System.out.println("Total amount of Deductions: " + totalDeductions);
			System.out.println("Net Pay: " + netPay);
			
			
		}
}
