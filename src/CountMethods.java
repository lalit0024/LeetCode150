public class CountMethods   {

    public static void main(String[] args) {
       // for (int i = 1; i < 4; i++) {
            System.out.println(countMethods(14));
        //}

    }


    static int countMethods (int n) {
        if (n==0){
            return 1 ;
        }if (n<0) {
            return 0;
        }
        return  countMethods(n-1)+countMethods(n-2)+ countMethods(n-3);
    }
}
