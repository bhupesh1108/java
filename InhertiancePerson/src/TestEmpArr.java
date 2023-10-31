import java.util.Scanner;


public class TestEmpArr {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=0;
	do {
	System.out.println("1. add new Employee\n 2. Modify salary \n3. display all ");
	System.out.println("4. display by id \n 5. calculate salary by id\n 6. calculate Bonus\n 7. exit\nchoice :");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("1. Salaried \n 2. Contract \n 3. vendor");
		int ch=sc.nextInt();
		EmployeeService.addnewEmployee(ch);
		break;
		
	case 2:
		System.out.println("enter id");
		int pid=sc.nextInt();
		System.out.println("enter salary");
		double s=sc.nextDouble();
		boolean status=EmployeeService.ModifysalById(pid,s);
		if(status) {
			System.out.println("modification done");
		}
		else {
			System.out.println("id not found");
		}
		
		break;
	
	case 3:
		EmployeeService.displayAll();
		break;
		
	case 4:
		System.out.println("Enter ID");
		int id = sc.nextInt();
	   Employee e = EmployeeService.displaybyid(id);
	    if(e!=null) {
	    	System.out.println(e);
	    }
	    else {
	    	System.out.println("ID not found");
	    }
     break;
		
		
		
	case 5:
		System.out.println("enter id");
		 pid=sc.nextInt();
	     double salary=EmployeeService.CalculateSalarybyId(pid);
	     if(salary!=-1) {
	    	 System.out.println("Net Salary : "+salary);
	     }
	     else {
	    	 System.out.println("not found");
	     }
		break;
		
		
		
	case 6:
	{
		System.out.println("Enter id");
		id = sc.nextInt();
		double bonus = EmployeeService.calBonusbyid(id);
		if(bonus == -2) {
			System.out.println("ID not found");
		}
		else if(bonus == -1) {
			System.out.println("Empolyee not of Salaried type ");
		}
		else {
			System.out.println(bonus);
		}
	
		break;
	}
		
		
	case 7:
		sc.close();
		System.out.println("Thank you for visiting.....");
		break;
	default:
		System.out.println("wrong choice");
		break;
	}
	}while(choice!=7);
	}
}
