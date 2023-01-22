import java.util.Scanner;

import javax.management.relation.RoleList;

class Person{
    String name;
    int age;
    Person(){
        
    }
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    public String toString(){
        System.out.println("Name : "+name + " Age :" + age );
        return null;
    }
}
class Student extends Person{
    int rollno;
    double[] marks;
    static int countStudent;
    static{
        countStudent = 0;
    }
    Student(){
        
    }
    Student(int rollno){
        countStudent++;
        this.rollno  = rollno;
    }
    Student(int rollno,double[] marks){
        countStudent++;
        this.rollno  = rollno;
        this.marks = marks;
    }
    Student(int rollno,String name,int age,double[] marks){
        countStudent++;
        this.rollno  = rollno;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    void setMarks(double[] marks){
        this.marks = marks;
    }

    void setRollno(int rollno){
        this.rollno = rollno;
    }
    public void displayDetails(){
        System.out.println("RollNo = "+rollno);
        System.out.println("Name = "+name);
        System.out.println("Arge = "+age);
        System.out.print("Marks = ");
        for(double i:marks){
            System.out.print(i + " ");
        }
    }

     
    double[] getMarks(){
        return marks;
    }
    String getName(){
        return name;
    }
    int getAverage(double[] marks){
        int sum = 0;
        for(int i=0;i<marks.length;i++){
            sum += marks[i];
        }
        return (sum/5);
    }
    public String toString(){
        String str = rollno + " "+name+" "+age+" "+marks;
        return str;
    }
    static String getCount(){
        String str =  "Number of students are :"+countStudent;
        return str;
    }
}
public class studentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Store the details of 3 students by creating an array of objects of Student class and display the details of the student who has the highest average amongst the three students.
        int roll_no,age;
        String name;
        Student[] students = new Student[3];
        double[] marks = new double[5];
        for(int i=0;i<students.length;i++){
                    System.out.print("Enter RollNo : ");
                    roll_no = sc.nextInt();
                    System.out.print("Enter Name : ");
                    name = sc.next();
                     System.out.print("Enter Age : ");
                    age = sc.nextInt();
                    for(int j=0;j<marks.length;j++){
                        System.out.print("Enter Marks of Subject"+(j+1)+ " : ");
                        marks[j] = sc.nextInt();
                    }
                students[i] = new Student(roll_no,name,age,marks);
        }
        int max = 0;
        Student ranker = new Student();
        for(int j=0;j<students.length;j++){
            if (max < students[j].getAverage(students[j].getMarks())){
                max = students[j].getAverage(students[j].getMarks());
                ranker = students[j];
            }
        }
        ranker.displayDetails();
        System.out.println(Student.getCount());
    }
}

