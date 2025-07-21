public class OneAway {
    public static void main(String[] args) {


        String s1 = "pales";
        String s2 = "pale";

        if(s1.length()==s2.length()) {
            oneEditReplace(s1, s2);
        }else if (s1.length()+1==s2.length()) {
            oneEditInsert(s1, s2);
        }else if (s1.length()==s2.length()+ 1) {
            oneEditInsert(s1, s2);
        }else{
            System.out.println("false");
        }


    }


    static void oneEditReplace(String s1, String s2) {

        int mimatchCounter =0 ;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                mimatchCounter++;
            }
        }
        if (mimatchCounter>1) {
            System.out.println("false");
        }else {
            System.out.println("true");
        }

    }
    static void oneEditInsert(String s1, String s2) {
             String longString ;
             String shortString ;
            if(s1.length()>s2.length()) {
                longString = s1 ;
                shortString = s2 ;
             }else {
                longString = s2 ;
                shortString = s1 ;
            }
             int mimatchCounter =0 ;
            for (int i = 0; i < longString.length(); i++) {
                 boolean found = false;
                for (int j = 0; j < shortString.length(); j++) {
                   if( longString.charAt(i) == shortString.charAt(j)) {
                       found= true ;
                       break;
                   }
                }
                if (!found) {
                    mimatchCounter++;

                }

            }
            if ( mimatchCounter>1) {
                System.out.println("false");
            }else  {
            System.out.println("true");
            }
    }
}
