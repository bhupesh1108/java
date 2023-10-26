package menudrivenass1;

import java.util.*;

public class ArrayClass {
	public static int[][] add2array(int[][]a,int[][]b) {
		int[][] temp =new int[3][3];
		for(int i=0 ;i<3 ;i++) {
			for(int j=0;j<3;j++) {
				temp[i][j]=a[i][j]+b[i][j];
			}
		}
		return temp;
	}
	 public static void acceptData(int[][] a) {
		 Scanner sc =new Scanner(System.in);
		 for(int i=0; i<a.length;i++) {
			 for(int j=0;j<a[0].length;j++) {
				 System.out.println("enter value :"+ i+"----"+j);
			  a[i][j]=sc.nextInt();
			 }}
		 }
		 
		 public static void display(int[][] a ) {
			 for(int i=0;i<a.length;i++) {
				 for(int j=0;j<a[0].length;j++) {
					 System.out.print(a[i][j]+" ");
				 }
				 System.out.println();
			 }
		 }
		 public static int[][] transpose(int[][] a){
			int[][] temp=new int[3][3];
			for (int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					temp[i][j]=a[j][i];
				}
			}
			return temp;
		 }
		 public static int minimum(int[][]a) {
				int temp =Integer.MAX_VALUE;
			 for(int i=0;i<3;i++) {
				 for(int j=0;j<3;j++) {
					 if (temp>a[i][j]) {
						 temp=a[i][j];
					 }
					 
				 }
			 }
			 return temp ;
		 }
		 public static int maximum(int[][] a){
				int temp =Integer.MIN_VALUE;
			 for(int i=0;i<3;i++) {
				 for(int j=0;j<3;j++) {
					 if (temp<a[i][j]) {
						 temp=a[i][j];
					 }
					 
				 }
			 }
			 return temp;
		 }

      public static int count(int[][] a ){
    	  Scanner sc =new Scanner(System.in);
    	  int val =sc.nextInt();
        int count=0;
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			if (val == a[i][j]) {
    				count++;
    			}
    		
    		}
    	}return count;
      
      }

}
