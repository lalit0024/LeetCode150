import java.util.Arrays;

public class Isomorphic {
    public static void main(String[] args) {
         boolean isomorphic = true;
        String s = "paper";
        String t = "title";

        if (s.length() != t.length()) {
            System.out.println("not  isomorphic");
            return;
        }

        int[] sHash = new int[256];
        int[] tHash = new int[256];
        for (int i = 0; i < s.length(); i++) {
            sHash[s.charAt(i)]++;
            tHash[t.charAt(i)]++;

        }
        Arrays.sort(sHash);
        Arrays.sort(tHash);
        System.out.println(Arrays.toString(sHash));
        System.out.println(Arrays.toString(tHash));
        for (int i = 0; i < sHash.length; i++) {
           if (tHash[i] != sHash[i]) {
               isomorphic = false;
               System.out.println("not isomorphic");
               return;
           }

        }


            System.out.println("isomorphic");


    }
}
