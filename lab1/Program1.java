
import java.util.Scanner;

abstract class Student{
    String studentName;
    int[] testScores;
    String testResult;
    Student(){
   	 
    }
    Student(String studentName){
   	 this.studentName = studentName;
    }
    public String getStudentName() {
   	 return studentName;
    }
    public void setStudentName(String studentName) {
   	 this.studentName = studentName;
    }
    public int[] getTestScores() {
   	 return testScores;
    }
    public void setTestScore(int testNumber,int testScore) {
   	 testScores[testNumber] = testScore;
    }
    public void setTestScores(int[] testScores) {
   	 this.testScores = testScores;
    }
    public String getTestResult() {
   	 return testResult;
    }
    public void setTestResult(String testResult) {
   	 this.testResult = testResult;
    }
    abstract void generateResult();
}
class UndergraduateStudent extends Student{
    UndergraduateStudent(String studentName){
   	 super.studentName = studentName;
    }
    public void generateResult() {
   	 int sum = 0;
   	 for(int i:testScores) {
   		 sum+=i;
   	 }
   	 if((sum/testScores.length) >= 60) {
   		 System.out.println("Pass");
   	 }else {
   		 System.out.println("Fail");
   	 }
    }
}
class GraduateStudent extends Student{
    GraduateStudent(String studentName){
   	 super.studentName = studentName;
    }
    public void generateResult() {
   	 int sum = 0;
   	 for(int i:testScores) {
   		 sum+=i;
   	 }
   	 System.out.println("Name : "+getStudentName());
   	 System.out.println("Result : "+sum/testScores.length);
    }
}
public class Program1 {
    public static void main(String[] args) {
   	 Scanner sc = new Scanner(System.in);
   	 System.out.println("1.Graduate \n2.Undergraduate");
   	 int option = sc.nextInt();
   	 System.out.print("Enter name : ");
   	 String name = sc.next();
   	 int[] marks = new int[5];
   	 System.out.println("Enter Marks");
   	 for(int i=0;i<5;i++) {
   		 System.out.print("Marks of subject "+(i+1)+" : ");
   		 marks[i] = sc.nextInt();
   	 }
   	 if(option == 1) {
   		 GraduateStudent g = new GraduateStudent(name);
   		 g.setTestScores(marks);
       g.generateResult();
   	 }else {
   		 UndergraduateStudent ug = new UndergraduateStudent(name);
       ug.setTestScores(marks);
   		 ug.generateResult();
   	 }
    }
}
