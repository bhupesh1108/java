package menudrivenass1;

import java.util.Scanner;

public class arraymain {

	public static void  main(String [] args) {
      int[][] a= new int[3][3];
      int[][] b= new int [3][3];
      int[][] c= new int [3][3];
      int d;
      int e;
		int num;
	
	 
	   
	
	
	
	
	do{
		System.out.println("enter the number:");
		System.out.println("1 for add two array");
		System.out.println("2 for transpose");
		System.out.println("3 for minimum of array");
		System.out.println("4 for maximum of array");
		System.out.println("5 for array");
		System.out.println("6 for count of number in array");
		System.out.println("7 for exit");
		
		Scanner sc =new  Scanner(System.in);
	 num =sc.nextInt();
	    switch(num) {
	    case 1:
	    	ArrayClass.acceptData(a);
			ArrayClass.acceptData(b);
	    c=	ArrayClass.add2array(a, b);
	    ArrayClass.display(c);
	    break;
	    case 2:
	    	ArrayClass.acceptData(a);
	    	ArrayClass.display(c);
			  ArrayClass.display(a);
		c=	ArrayClass.transpose(a);
		  ArrayClass.display(c);
		  break;
	    case 3:
	    	ArrayClass.acceptData(a);
	    	  d= ArrayClass.minimum(a);
	   	   System.out.println(d);
	   	   break;
	    case 4:
	    	ArrayClass.acceptData(a);
	    	d=ArrayClass.maximum(a);
	    	System.out.println(d);
	    	break;
	    
	    case 5:
	    	ArrayClass.acceptData(a);
	    	ArrayClass.acceptData(b);
		ArrayClass.display(a);
		ArrayClass.display(b);

		
		
	    	break;
	    case 6:
	    	  e=ArrayClass.count(a);
	   	   System.out.println(e);
	   	   break;
	    
	    case 7:
	    	System.out.println("exit(0)");
	    	System.exit(0);
	    	break;
	    default: 
	    	System.out.println("invalid choise");
	    }	
	}while(num!=8);
	
}}
