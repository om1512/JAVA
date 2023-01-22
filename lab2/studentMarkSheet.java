
import java.util.*;
 
class student{
   // int roll_no, String name and an array to store marks of 5 subjects.
   int roll_no;
   String name;
   int[] marks = new int[5];
  
   student(){
 
   }
   student(int roll_no,String name,int[] marks){
       this.roll_no = roll_no;
       this.name = name;
       this.marks = marks;
   }
 
   void setRollno(int roll_no){
       this.roll_no = roll_no;
   }
   void setName(String name){
       this.name = name;
   }
   void setMarks(int[] marks){
       this.marks = marks;
   }
 
   int[] getMarks(){
       return marks;
   }
   String getName(){
       return name;
   }
 
   int getAverage(int[] marks){
       int sum = 0;
       for(int i=0;i<marks.length;i++){
           sum += marks[i];
       }
       return (sum/5);
   }
   public String toString() {
       String str = "RollNo : "+roll_no+" || Name : "+name+" || ";
       for(int i=0;i<marks.length;i++){
           str += " Subject"+(i+1)+" : "+marks[i];
       }
       return str;
   }
 
 
}
 
public class studentMarkSheet {
 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
 
       int roll_no;
       String name;
       int[] marks = new int[5];
      System.out.println("--------------------------------------------");
       System.out.println("To add data of single studnt press 1");
       System.out.println("To add data of 3 studnts press 2");
       System.out.println("--------------------------------------------");

       int option = sc.nextInt();
       if(option == 1){
       //Store the details of one student by creating one object of Student class and display  them.
       System.out.print("Enter RollNo : ");
       roll_no = sc.nextInt();
       System.out.print("Enter Name : ");
       name = sc.next();
       for(int i=0;i<marks.length;i++){
           System.out.print("Enter Marks of Subject"+(i+1)+ " : ");
           marks[i] = sc.nextInt();
       }
       student s = new student(roll_no,name,marks);
       System.out.println("--------------------------------------------");
       System.out.println(s.toString());
       System.out.println("--------------------------------------------");

       
       }else if(option == 2){
 
           //Store the details of 3 students by creating an array of objects of Student class and display the details of the student who has the highest average amongst the three students.
           student[] students = new student[3];
           for(int i=0;i<students.length;i++){
                       System.out.print("Enter RollNo : ");
                        roll_no = sc.nextInt();
                       System.out.print("Enter Name : ");
                        name = sc.next();
                       for(int j=0;j<marks.length;j++){
                           System.out.print("Enter Marks of Subject"+(j+1)+ " : ");
                           marks[j] = sc.nextInt();
                       }
                   students[i] = new student(roll_no,name,marks);
           }
           int max = 0;
           student ranker = new student();
           for(int j=0;j<students.length;j++){
               if (max < students[j].getAverage(students[j].getMarks())){
                   max = students[j].getAverage(students[j].getMarks());
                   ranker = students[j];
               }
           }
           System.out.println("Ranker Is : "+ranker.getName());
       }
   }
}

