import java.util.HashMap;
import java.util.Scanner;

public class StringCount {
    public static void main(String[] agr){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String sts=sc.nextLine();

        // String s="Rain Rain Come again Ganesh pranay pranay bisan bhupesh verma Ganesh";
        String[] str=sts.split(" ");
        HashMap<String,Integer> hs=new HashMap<>();
        for(String st:str){
            if(hs.containsKey(st)){
                int val=hs.get(st);
                hs.put(st, val+1);
            }
            else{
                hs.put(st,1);
            }
        }
      
    System.out.println(hs);
}
}
