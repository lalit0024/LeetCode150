public class IntToToman {
    public static void main(String[] args) {
        int number =3749 ;

       String str = Integer.valueOf(number).toString();
       char[]  ch = str.toCharArray();
       for (int i = 0; i < ch.length; i++) {
           StringBuffer sb = new StringBuffer();
           sb.append(convert(ch[i]));
           for (int j = 1; j < ch.length; j++) {
               sb.append('0');
           }

       }

        System.out.println(900%500);
        System.out.println(900/500);


    }

    static String convert(String instr) {
          Integer integer = Integer.valueOf(instr);
           StringBuffer sb = new StringBuffer();




        return "";
    }

    static char convert(int ch) {
        switch (ch) {
            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';

            default :return '_';
        }
    }
}
