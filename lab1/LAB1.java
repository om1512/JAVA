public class LAB1 {
 
    int[][] sumOfMatrix(int[][] arr1,int[][] arr2){
        int[][] ans = new int[arr1.length][arr1.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }
    int[][] multplicationOfMatrix(int[][] arr1,int[][] arr2){
        int[][] ans = new int[arr1.length][arr1.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans.length;j++){
                ans[i][j] = 0;
                for(int k=0;k<ans.length;k++){
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }                
            }  
        }
        return ans;
    }
    public static void main(String[] args) {
        int [][]arr1  = {{1,2},{3,4}};
        int [][]arr2  = {{1,2},{3,4}};
        int [][]sumArray = new int[arr1.length][arr2.length];
        int [][]mulArray = new int[arr1.length][arr2.length];

        LAB1  p = new LAB1();

        sumArray = p.sumOfMatrix(arr1, arr2);
        System.out.println("---------------------------------");

        System.out.println("Sum Of Matrix");
        for (int[] is : sumArray) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }  
        System.out.println("---------------------------------");
        mulArray = p.multplicationOfMatrix(arr1, arr2);
        System.out.println("Multiplication Of Matrix");
        for (int[] is : mulArray) {
            for (int is2 : is) {
                System.out.print(is2 + " ");
            }
            System.out.println();
        }  
        System.out.println("---------------------------------");

    }
 }
 