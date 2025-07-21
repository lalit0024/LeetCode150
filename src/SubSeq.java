public class SubSeq {

    public static void main(String[] args) {
        String s = "gksrek";
        String t = "geeksforgeeks";
        char[] find = s.toCharArray();
        char[] findInt = t.toCharArray();
        int start = 0;
        int matchCounter =0;
        for (int i = 0; i < find.length; i++) {
            for (int j = start; j < findInt.length; j++) {
                if(find[i] == findInt[j]) {
                    start = j+1;
                    matchCounter++;
                    break;
                }
            }
            if(start ==0) {
                System.out.print("Not a sub Seq..>");
                break;
            }
        }
        if(matchCounter==s.length()) {
            System.out.print("is sub Seq");
        }else {
            System.out.print("Not a sub Seq");
        }
    }
}
