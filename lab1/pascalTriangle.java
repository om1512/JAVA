class pascalTriangle{
    static void TriangleBuilder(int n){
        int val;
        for(int i =1;i<=n;i++){
            val = 1;
            for(int j=i;j<=n;j++){
                System.out.print(val);
                val =(val * (i-j)) / j+1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TriangleBuilder(10);
    }
}