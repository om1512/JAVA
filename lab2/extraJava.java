class RangeException extends Exception {
  RangeException(String str){
      super(str);
  }  
}
 class extraJAVA {
  static void add(String[] strArray) throws RangeException{
      double[] d = new double[strArray.length];
      int i=0;
      double temp;
      for(String s:strArray){
         
              temp = Double.parseDouble(s);
              if(temp < 0 || temp > 1){
                  throw new RangeException("Input needs to be in range 0 to 1");
              }
              d[i] = temp;
              i++;
         
      }
     
  }
  public static void main(String[] args) {
      String[] str = {"1.5","0.1","10"};
      try{
          add(str);
      }catch(RangeException e){
          System.out.println(e);
      }catch(NumberFormatException e){
          System.out.println(e);
      }finally{
          System.out.println("thank you for using this program");
      }
  }
}
