/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class testing
{
	public static void main (String[] args) throws java.lang.Exception
	{
			// your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                while(n!=0){
                    int sum = 0;
                    for(int i=1;i<=n;i++){
                        sum += i;
                    }
                    if(sum % 2 == 0){
                        System.out.println(n);
                        break;
                    }else{
                        n--;
                    }
                }
            }
	}
}
