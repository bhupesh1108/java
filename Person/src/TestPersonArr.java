import java.util.Scanner;
public class TestPersonArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("1.Add new person \n, 2.Display all \n, 3.Display by id \n 4.Update mobbile");
			System.out.println("5. Display by name \n 6 exit \n choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				PersonServices.addNewPerson();
				break;
			case 2:
				PersonServices.displayAll();
				break;
			case 3:
				int id=sc.nextInt();
				Person ob =PersonServices.searchbyid(id);
				if(ob!=null){
					System.out.println(ob);
				}
				else 
					System.out.println("not found"+id);
				break;
			case 4:
				System.out.println("enter the id ");
				int A = sc.nextInt();
				System.out.println("enter the phone number:");
				String B = sc.next();
				PersonServices.updatePhone(A, B);
				
			case 5:
				System.out.println("enter name");
				sc.nextLine();
				String nm = sc.nextLine();
				
				Person[] plist=PersonServices.getByName(nm);
				if(plist!=null) {
					for(Person p:plist) {
						System.out.println(p);
					}
				}
				else {
					System.out.println("not found");
				}
				break;
			
		case 6:
			}
		}while(choice!=0);
	}
}
