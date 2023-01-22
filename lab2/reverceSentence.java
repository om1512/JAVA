import java.util.Scanner;

public class reverceSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence : ");
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        for(int i=0;i<strArray.length;i++){
            System.out.print(strArray[strArray.length -i -1] + " ");
        }
    }
}
