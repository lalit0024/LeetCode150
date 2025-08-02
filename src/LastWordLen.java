public class LastWordLen {

    public static void main(String[] args) {
        String s1 = "      ";
        int length = 0 ;
        for (int i = s1.length()-1; i >= 0; i--) {
            if(s1.charAt(i) == ' ' && length != 0) {
                break;
            }else if(s1.charAt(i) != ' '){
                length++;
            }

        }

        System.out.println(length);
    }
}
