public class Fibonnaci {

    public static void main(String[] args) {

        //Fibonnaci series
        // 0,1,1,2,3,5,8.........n?
        // 0,1,2,3,4,5,6.........n?
        // 1,2,3,4,5,6,7.........n?

        int val1 = 0;
        int val2 = 0;
       int temp = 0;
        for (int i = 0; i <= 6; i++) {
            //System.out.println("Enetering loop temp " + temp + " for iteration " + i);
          int tempV1 = 0 ;
           if (i == 0) {
              val1 =0;
              val2 =0;
           }  if (i == 1) {
              val1=0 ;
              val2=1;
            }else {
               tempV1 = val1 ;//0
               val1 = val2 ; //1
               val2 = tempV1 + val2 ;
            }


        }
        System.out.println(val2);
        System.out.println(fibonnaci(6));
    }



    public static int fibonnaci (int n ){

          if(n==0 )
              return 0 ;
          if (n==1)
              return 1 ;

       return  fibonnaci(n-1)+  fibonnaci(n-2) ;
    }

}
