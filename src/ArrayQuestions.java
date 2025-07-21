import java.util.Arrays;

public class ArrayQuestions {

    public static void main(String[] args) {
        String[] input = {"lalit", "deepika","aanvi","atharv"};

        for(int i = 0; i < input.length; i++){
            if (input[i].length()%2==0){
                input[i]= input[i].toUpperCase();
            }else {
                char[] chars = input[i].toCharArray();
                for(int j=0; j<chars.length; j++){
                    int ascii = (int) chars[j];
                    chars[j] =  (char)(ascii+1);
                }
                input[i]=  new String(chars);
            }
                   // System.out.println(input[i]);
        }
       // findArrayInArray();
        removeDupesSortedArray();
    }

     static void removeDupesSortedArray() {
         int[] inrarr = {5,5,5,6,6,6,6,7,8,8,8,9,10,10,11};
        int dupPointer = 1 ;
        int currentDupeValCounter = 0;
         for (int x=1; x<inrarr.length; x++){

             System.out.println("comparing" + inrarr[x] + " and " + inrarr[x-1]);
             if (inrarr[x]!=inrarr[x-1]) {
                 currentDupeValCounter =0 ;
                 System.out.println("Move dup pointer" + dupPointer);
                 inrarr[dupPointer] = inrarr[x];
                 dupPointer++;
             }
             else {
                 if(currentDupeValCounter == 0) {
                     inrarr[dupPointer] = inrarr[x];
                     dupPointer++;
                     currentDupeValCounter++;
                 }
             }

         }
         for (int x=dupPointer ; x<inrarr.length; x++){
             inrarr[x] = 0;
         }
         System.out.println(Arrays.toString(inrarr));

     }



    static void findArrayInArray(){
        int[] inrarr = {5,6,6,7,8,9,5,6};

        int k = 6 ;
        int j = 0;
        for (int x=0; x<inrarr.length; x++){
            if (inrarr[x] != k){ //0,3,4,5,6
                inrarr[j] = inrarr[x];
                j++;

            }

        }
        for (int x=j; x<inrarr.length; x++){
            inrarr[x] = 0;
        }
         System.out.println(j);
        System.out.println(Arrays.toString(inrarr));
    }
}
