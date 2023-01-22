import java.util.*;
class hiCounter{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String : ");
       String str= sc.next();
       int count = 0;
       String lowerCaseString = str.toLowerCase();
       for(int i=0;i<lowerCaseString.length()-1;i++){
           if(lowerCaseString.charAt(i) == 'h' && lowerCaseString.charAt(i+1) == 'i'){
                   count++;
           }
       }
       System.out.println("The Number Of hi in string " + str + " is "+count);
   }    
}
