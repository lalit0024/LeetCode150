public class StringPermutations {
    public static void main(String[] args) {
        String a= "laalit" ;
        String b = "lllait";
       permuation(a,b);
    }

    static void permuation(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println("Not a  permutation");
            return;
        }
        int[] letters =  new int[128];
        for (int i = 0; i < a.length(); i++) {
            letters[a.charAt(i)]++;
        }

        for (int i = 0; i < b.length(); i++) {
            letters[b.charAt(i)]--;
            if (letters[b.charAt(i)] < 0) {
                System.out.println("Not a  permutation becaise of ");
                return;
            }
        }
        System.out.println("IS a  permutation");
    }
}
