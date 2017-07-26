package Assignment3;

	abstract class Employee { // creating a Employee class as mention in question
		
		// variable declaring as mention in question.
		int empId;
		String empName;
		int total_leaves;
		double total_salary;
		
		                              // here i'm creating constructor 
		Employee(int id, String name, int total, double salary) {
			empId = id;
			empName = name;
			total_leaves = total;
			total_salary = salary;
		}
		
		void calculate_balance_leaves() {//here i'm creating abstract method as mention in question 
		}

		boolean avail_leave(int no_of_leaves, char type_of_leave) {
			return true;
		}

		void calculate_salary() {

		}

	}
	
	// creating a another PermanentEmp class which will extends Employee class, as mention in question

	class PermanentEmp extends Employee {
		//here i'm creating constructor
		PermanentEmp(int id, String name, int total, double salary) {
			
			super(id, name, total, salary);//here i'm using super keyword
		}
		//here i'm initializing variable
		int paid_leave = 4, sick_leave = 2, casual_leave = 1;
		
		double basic = 32000, hra = 10000, pfa = 3700;
		/*  method declare */
		void print_leave_details() {
			System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
		}

		void calculate_balance_leaves() {
			int total = total_leaves - (paid_leave + sick_leave + casual_leave);
			System.out.println("leave Balance =" + total);
		}

		boolean avail_leave(int no_of_leaves, char type_of_leave) {
			if (no_of_leaves < total_leaves)
				return true;
			else
				return false;

		}

		void calculate_salary() {
			//here i'm doing calculation for Permanent Employee Salary.
			double hra = .5f * basic;
			double da = .2f * basic;
			double totalSalary = total_salary + (hra + da) - pfa;
			System.out.println("Salary =" + totalSalary);

		}
	}

	// creating a another TemporaryEmp class which will extends Employee class, as mention in question
	class TemporaryEmp extends Employee {
		

		TemporaryEmp(int id, String name, int total, double salary) {// here i'm creating constructor 
			
			super(id, name, total, salary);// here i'm using super keyword 

		} //here i'm initializing variable 

		int paid_leave = 4, sick_leave = 3, casual_leave = 2;
		

		void print_leave_details() {//here i'm creating abstract method as mention in question 
		
			System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
		}


		void calculate_balance_leaves() {
			//here i'm doing calculation for leave balance. 
			int total = total_leaves - (paid_leave + sick_leave + casual_leave);
			System.out.println("leave Balance =" + total);

		}

		
		boolean avail_leave(int no_of_leaves, char type_of_leave) {
			if (no_of_leaves < total_leaves)
				return true;
			else
				return false;
		}

		
		void calculate_salary() {
			float hra = (float) 50.50;
			int rate = 1200;
			
			double totalSalary = hra * rate;//here i'm doing calculation for Temporary Employee Salary. 
			
			System.out.println("Salary =" + totalSalary);//window console

		}

	}

