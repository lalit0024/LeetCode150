public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flowe"};
        StringBuilder sb = new StringBuilder();
        String prefix = "";
        int preFixIndex = 0;
        boolean flag = true;
        while (flag) {
           for (int i = 0; i < strs.length; i++) {
               if(strs[i].length()-1< preFixIndex) {
                   flag = false;
                   break;
               }
               if(prefix.isEmpty()){
                   prefix =  strs[i].substring(preFixIndex, preFixIndex+1);
               }
               if( !strs[i].substring(preFixIndex, preFixIndex+1).equals(prefix)){
                   flag= false;
                   break;
               }
               if(i==strs.length-1){
                   sb.append(prefix);
                   prefix="";
                   preFixIndex++;
               }
           }
       }

   System.out.println( sb.toString() );


    }
}
