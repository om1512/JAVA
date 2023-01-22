import java.util.Scanner;
 
// Create an interface Account with two methods: deposit and withdraw. Create class
// SavingsAccount which implements the interface. Write a custom Exception handler for
// SavingsAccount to handle the scenarios when the withdrawn amount is larger than the
// balance in the account.
interface Account{
   int deposit(int amount);
   int withdraw(int amount);
}
class SavingsAccount implements Account {
   static int balance;
  
   public int deposit(int amount){
       balance+=amount;
       return balance;
   }
   public int withdraw(int amount){
       balance-=amount;
       return balance;
   }
   public int getAmount(){
       return balance;
   }
 
 
 
   public void setAmount(int amount){
       balance=amount;;
   }
}
class AccountException extends Exception{
   public AccountException(String str){
       super(str);
   }
}
public class AccountSystem {
   public static void main(String[] args) {
      
       Scanner sc =new Scanner(System.in);
       SavingsAccount s = new SavingsAccount();
      
       int option = 0;
       while(option != 4){
       System.out.println();
           System.out.println("1. Deposite");
       System.out.println("2. Withdraw");
       System.out.println("3. Chack Balance");
       System.out.println("4. terminate");
           option = sc.nextInt();
           switch(option){
               case 1:
                   System.out.print("Enter Amount you want to deposite : ");
                   s.deposit(sc.nextInt());
                   break;
               case 2:
                   try{
                       System.out.print("Amount you want to withdraw : ");
                       int amount = sc.nextInt();
                       if(s.getAmount() < amount){
                           throw new AccountException("Not Sufficant Balance");
                       }else{
                           s.setAmount(s.getAmount()-amount);
                       }  
                       System.out.println("Emount withdrawed");
                   }catch(AccountException e){
                       System.out.println(e);
                       System.exit(0);
                   }
                   break;
               case 3:
                   System.out.println("Your Account Balance is : "+s.getAmount());
                   break;
               case 4:
                   break;
           }
       }
   }
}
