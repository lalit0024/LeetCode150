public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "  hello world  ";
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

    }
}
