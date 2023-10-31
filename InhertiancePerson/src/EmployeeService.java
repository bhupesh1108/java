import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class EmployeeService {
	static Employee[] emparr;
	static int cnt;
	static {
		emparr=new Employee[100];
		emparr[0]=new SalariedEmp(12,"sakshi","8781","sa@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		emparr[1]=new SalariedEmp(13,"Pawar","555","pa14@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377);
		emparr[2]=new ContractEmployee(14,"Bhupesh","666","bh11@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000);
		emparr[3]=new ContractEmployee(15,"Verma","777","ver1@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000);
		cnt=4;
	}
	
	public static void addnewEmployee(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter joining date(dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		switch(ch) {
		case 1:
			System.out.println("enter salary");
			double s = sc.nextDouble();
			System.out.println("Enter Bonus");
			double b = sc.nextDouble();
			emparr[cnt]= new SalariedEmp(pid, nm, mob, em, dept, desg,ldt, s, b);
			break;
			
		case 2:
			System.out.println("enter hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges");
			double charges=sc.nextDouble();
			emparr[cnt]=new ContractEmployee(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
			break;
			
			
		case 3:
			System.out.println("enter number of emp ");
			int noemp = sc.nextInt();
			System.out.println("enter the amount  ");
			double amt = sc.nextDouble();
			emparr[cnt]=new vendor(pid, nm, mob, em, dept, desg, ldt, noemp, amt);
			break;
		}
		cnt++;
		}
	
	
	
	
	public static void displayAll() {
	
		for(Employee e:emparr) {
			if(e!=null) {
				System.out.println(e);
			}
			else {
				break;
			}
		}
		
	}
	
public static boolean ModifysalById(int pid, double s) {
		int pos=searchById(pid);
		if(pos!=-1) {
			if(emparr[pos] instanceof SalariedEmp) {
				((SalariedEmp)emparr[pos]).setSal(s);
		        
		    }else if(emparr[pos] instanceof ContractEmployee) {
		    	((ContractEmployee)emparr[pos]).setCharges(s);
		    }else if(emparr[pos] instanceof vendor) {
		    	((vendor)emparr[pos]).setAmt(s);
		 
		    }
			return true;
		}
		else
			return false;
	}
	
	
public static int searchById(int pid) {
 		for(int i=0;i<cnt;i++) {
 			if(emparr[i].getPid()==pid) {
 				return i;
 			}
 		}
 		return -1;
 	}




public static Employee  displaybyid(int id) {
		for(int i=0;i<cnt;i++) {
			
			if(emparr[i].getPid()==id) {
				return emparr[i];
			}
		}
		return null;
	}


public static double calBonusbyid(int id)
{ 
	int pos=searchById(id);
	if(pos!=-1) {
		if(emparr[pos] instanceof SalariedEmp) {
			return((SalariedEmp)emparr[pos]).calculateBonus();
		}
		else {
			return -1;
		}
	}
	return -2;
	}


public static double CalculateSalarybyId(int pid) {
	int pos = searchById(pid);
	if(pos != -1){
		return emparr[pos].calculateSal();	
	}
	return -1;
	
}




}
	

