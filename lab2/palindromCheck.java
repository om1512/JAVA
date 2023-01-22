import java.util.*;
public class palindromCheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String : ");
       String str = sc.next();
       String lowerCase = str.toLowerCase();
       boolean flag = true;
       for(int i=0;i<str.length()-1;i++){
           if(lowerCase.charAt(i) != lowerCase.charAt(lowerCase.length()-i-1))
           {
               flag = false;
               break;
           }
       }
       if(flag){
           System.out.println("String is Palindrom");
       }else{
           System.out.println("String is not Palindrom");
       }
    }
}