import java.util.*;
public class abbreviations{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Full Name : ");
       String name = sc.nextLine();
       String[] nameArr = name.split(" ");
       System.out.print(nameArr[0].charAt(0)+". "+nameArr[1].charAt(0)+". "+nameArr[2]);
   }
}
