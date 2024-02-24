
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		         Scanner sc=new Scanner(System.in);
        int testCase=sc.nextInt();
        for(int i=0;i<testCase;i++){
            String str=sc.next();
            String subString=sc.next();
            System.out.println(str.indexOf(subString));
            
		      }
	}
}