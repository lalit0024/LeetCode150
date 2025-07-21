public class ConsSum {
    public static void main(String[] args) {

        String num = "67199" ;


        process(num);
    }

    static  void process (String num) {
        if (num.length()==1) {
            System.out.println(num);
            return;
        }
        char[] arr = num.toCharArray() ;
        int sum = Integer.parseInt(String.valueOf(arr[0]));
        int prevDigit  = Integer.parseInt(String.valueOf(arr[0]));
        StringBuilder newVal = new StringBuilder();
            for (int x=1; x<arr.length; x++){
                int currDigit = Integer.parseInt(String.valueOf(arr[x])) ;
                 if (prevDigit==currDigit){
                   // sum = prevDigit+Integer.parseInt(String.valueOf(arr[x]));
                    sum = sum+currDigit;
                }else {
                     newVal.append(Integer.toString(sum));
                     sum=Integer.parseInt(String.valueOf(arr[x]));
                 }
                prevDigit = Integer.parseInt(String.valueOf(arr[x])) ;
                 if(x==arr.length-1){
                     newVal.append(Integer.toString(sum));
                 }
            }
        if(newVal.toString().equals(num)){
            System.out.println(num);
        }else{
            process(newVal.toString()) ;
        }
       // ;

    }
}
