public class PalindromePerm {
    public static void main(String[] args) {
        String input = "ttaaaaatt" ;
        input = input.toLowerCase();
        int[] asciInt = new int[256];
        int oddCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            asciInt[input.charAt(i)]++;
            if (asciInt[input.charAt(i)] % 2 == 1) {
                oddCounter++;
            }else {
                oddCounter--;
            }
        }
        if (input.length()%2 ==1 && oddCounter == 1) {
            System.out.println(true);
        }
        else if (input.length()%2 ==0 && oddCounter == 0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        oddCounter = 0;
        boolean even = false;
        boolean result = true;
        if(input.length()%2==0) {
            even = true;
        }
        for (int i = 0; i < asciInt.length; i++) {
            if (asciInt[i] %2==1){
                oddCounter++;
            }
            if(!even && oddCounter >1) {
                System.out.println("not a perm of palindrome");
                result= false;
                break;
            }
        }
        System.out.println(result);

    }
}
