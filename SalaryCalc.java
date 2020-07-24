package Basics;

// here I am computing my annual salary as a software developer

public class SalaryCalc {
	public static void main(String[] args) {
		
		//Let's first declare a variable
		String career;
		System.out.println("This Program has begun!");
		
		//Next we define the above variable
		career = "Junior Software Developer";
		System.out.println("My new career is: " + career);
		
		//Next we declare and define our income
		int hoursPerweek = 40;
		int weeksPeryear = 52;
		double rate = 14.50;
		
		double salary = hoursPerweek * weeksPeryear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " every year" );
		
		
		
		
		
	}

}
