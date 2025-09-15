public class StringSort {

    public static void main(String[] args) {
        String s = "Deepika";
        s = s.toLowerCase();
        char [] chars = s.toCharArray();
        int[] freqArr = new int[256];
        for (char c : chars) {
            freqArr[c]++;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < freqArr.length; i++) {
            for (int j = 0; j < freqArr[i]; j++) {
                char c = (char)i;
                builder.append(Character.toString(c));
            }
        }

        System.out.println(builder.toString());
    }
}
