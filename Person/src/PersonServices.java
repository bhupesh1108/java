import java.util.Scanner;

public class PersonServices {
	static Person[] parr;
	static int cnt;
	static {
	parr=new Person[100];
	parr[0]=new Person("Sakshi","548456");
	parr[1]=new Person("Pawar","4654652");
	parr[2]=new Person("Bhupesh","8971564");
	parr[3]=new Person("Verma","156414");
	cnt=4;
	}
	
	public static void addNewPerson() {
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter id");
//  int id=sc.nextInt();
//	sc.nextLine();
	System.out.println("ENter Name");
	String nm =sc.nextLine();
	System.out.println("ENter mobile");
	String mob = sc.next();
	parr[cnt]=new Person( nm, mob);
	cnt++;
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
	}
	public static Person searchbyid(int id) {
		for(Person p:parr) {
			if(p!=null) {
			if(p.getid()==id) {
				return p;
			}else return null;
		}
			
			 }
		return null;
	}
	public static int updatePhone(int id,String phone) {
		// System.out.println("enter the id of which you want to change number");
	 for(int i=0;i<cnt;i++) {
		
		 if(parr[i].getid()==id) {
			 parr[i].setphone(phone);
		 }
	     return 1;		
		 
	
	 }
	 return -1;
	 }
	public static Person[] getByName(String nm) {
		Person[] arr = new Person[10];
		int cnt1=0;
		for(int i=0;i<cnt;i++) {
			if(parr[i].getname().equals(nm)) {
				arr[cnt1]=parr[i];
			cnt1++;
		}
		if(cnt1>0) {
			return arr;
		}
		return null;
	}
	
	}
}

