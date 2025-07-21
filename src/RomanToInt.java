public class RomanToInt {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        char[] ch = s.toCharArray();
        int preValue = 0 ;
        int currentvalue = 0 ;
        for (int i = 0; i < ch.length; i++) {
               if (convert(ch[i])>preValue){
                   currentvalue  += convert(ch[i])-(2*preValue);

               }else {
                   currentvalue+= convert(ch[i]);
               };
            preValue = convert(ch[i]);
        }
        System.out.println( currentvalue );
    }
    static int convert(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;

            default :return 0;
        }
    }
}
