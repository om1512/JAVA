import java.util.Scanner;

public class charFind {
    public static void main(String[] args) {
    System.out.println("Enter String : ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    char[] s = str.toLowerCase().toCharArray();
    char c = 'a';
    int counter = 0,max = 0,secondBest = 0,decreser = 0;
        for(int i=0;i<s.length - decreser;i++){
           counter=1;
            for(int j=i+1;j<s.length-decreser;j++){
                if(s[i] == s[j]){
                  counter++;        
                  int k = j;
                  decreser += 1;
                  while(k < s.length-decreser)
                  {
                    s[k] = s[k+1];
                    k++;
                  }
                }
            }
            if(counter > max){
                max = counter;
            }else if(counter > secondBest){
                secondBest = counter;
                c = s[i];
            }
        }
        System.out.println("Second Most Frequent : "+max);
    }
}
