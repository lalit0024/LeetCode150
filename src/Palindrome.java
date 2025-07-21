public class Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama" ;
        s = s.toLowerCase();
        s = s.replaceAll("[^A-Za-z]", "");
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        int i=0 ;
        boolean flag = true;
        while(i<j) {
            if (chars[i] != chars[j]) {
                flag = false;
                System.out.println("not a palindrome");
                break;
            }
            i++;
            j--;

        }
        if(flag){
            System.out.println("a palindrome");
        }


    }


}
