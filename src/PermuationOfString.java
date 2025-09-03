import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuationOfString {
    public static void main(String[] args) {

        String str = "abcd";
        char[] chars = str.toCharArray();
        List<String> list = new ArrayList<>();

          permute(chars, list,0);

            System.out.println(list);
            //System.out.println(new HashSet<>(list));

    }


    static void permute( char[] chars  , List<String> list , int index) {

        if ( index == chars.length) {
            list.add( new String(chars));
            return;
        }


        for (int i = index; i < chars.length; i++) {
            //SWAP
            char temp = chars[i] ;
            chars[i] = chars[index];
            chars[index] = temp;

            permute( chars, list, index+1);
            //SWAP Back
            temp = chars[i] ;
            chars[i] = chars[index];
            chars[index] = temp;
        }


    }
}
