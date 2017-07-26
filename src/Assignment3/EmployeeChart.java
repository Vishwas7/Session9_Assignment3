package Assignment3;

public class EmployeeChart {

		public static void main(String[] args) {
			
			System.out.println("Employee Chart");
		

			//here i've created PermanentEmp class object
			Employee perEmp = new PermanentEmp(77, "Vishwas", 11, 32000);
		
			System.out.println("\nParmanent employee detail Chart");// window console
			
			// in here i'm calling id,name,no of leaves of class PermanentEmp
			System.out.println("Name =" + perEmp.empName);
			System.out.println("Id  =" + perEmp.empId);
			System.out.println("Leave =" + perEmp.total_leaves);
			
			//in here i'm calling method of class PermanentEmp
			perEmp.calculate_balance_leaves();
			perEmp.avail_leave(21, (char) 0);
			perEmp.calculate_salary();
			
			
		

			//here i've created PermanentEmp class object
			Employee temEmp = new TemporaryEmp(50, "Shahid", 20, 50001);
			
			System.out.println("\nTemporary employee detail Chart");//window console 
			
			//in here i'm calling id,name,no of leaves of class PermanentEmp
			System.out.println("Name =" + temEmp.empName);
			System.out.println("Id  =" + temEmp.empId);
			System.out.println("Leave =" + temEmp.total_leaves);
			
			//in here i'm calling method of class PermanentEmp
			perEmp.calculate_balance_leaves();
			perEmp.avail_leave(20, (char) 0);
			perEmp.calculate_salary();

		}

	}
