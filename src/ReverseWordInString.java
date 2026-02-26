public class ReverseWordInString {
    public static void main(String[] args) {

        reverseWords("    the   sky   is      blue    ");
        String s = "a good   example";
        String matcher = "world hello";
        s= s.trim();
        s=  s.replaceAll("\\s+", " ");
        String [] strArr = s.split(" ");
        int i=0 ;
        int j=strArr.length-1;
        String temp;
        StringBuffer sb = new StringBuffer();
       while (i<j){
           temp= strArr[i];
           strArr[i]=strArr[j];
           strArr[j]=temp;
           i++;
           j--;
       }
       for (int k = 0; k < strArr.length; k++) {
           sb.append(strArr[k]);
           if(k!= strArr.length-1) {
               sb.append(" ");
           }
       }
  System.out.println(sb.toString());
    }


    static String reverseWords(String s) {
        StringBuffer sb = new StringBuffer();
        char[] str = s.toCharArray();
        int wordPointer = 0 ;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') {
                if (wordPointer != 0) {
                    sb.append(str[i]);
                    wordPointer =0;
                }
            }else{
                sb.append(str[i]);
                wordPointer++;
            }

        }


        System.out.println(sb.toString());
        return sb.toString();
    }
}
