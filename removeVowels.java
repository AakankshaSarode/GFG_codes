
import java.util.*;

public class practice {
    // method 1
   /* public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String s= sc.nextLine();
          for( int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e'||
                        s.charAt(i)=='i' || s.charAt(i)=='o'||
                        s.charAt(i)=='u' ||  s.charAt(i)=='A'
                    ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||
                        s.charAt(i)=='O'
                    ||s.charAt(i)=='U'){
                    continue;

                }
                 else{
                    System.out.print(s.charAt(i));
                }
          }
    }

    */
    // another method
    static String remVowel(String str){
         return str.replaceAll("[aeiouAEIOU]", " ");
    }
   public static void main(String[] args) {
       String str= "GeekforGeeks -A computer Science portal for geeks";
       System.out.println(remVowel(str));
   }
}
