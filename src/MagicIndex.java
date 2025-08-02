import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicIndex {

    public static void main(String[] args) {
        List<Integer> magicIndex = new ArrayList<>();



        int[] intArr  =  {-2,-1,2,2,2,2,5,7,8,9};
        int[] intArr2  = {6,5,4,3,2,1,0};
      //  magicIndexRecursive(intArr,0);
      //  magicIndexRecursiveWithIndex(intArr, 0 , intArr.length-1);
       // System.out.println(Arrays.toString(intArr) +"-->"+magicIndex);
        magicIndex = new ArrayList<>();;
       // magicIndexRecursive(intArr2, magicIndex);
        //System.out.println(Arrays.toString(intArr2)+"-->"+magicIndex);
    }

    static void magicIndex (int[] array , List<Integer>  magicIndex){
        if (array!=null && array.length >0){
           if (array.length>1){
               //Increasing order
                   for (int i = 0 ; i < array.length ; i++){
                       if (array[i]==i){
                           magicIndex.add(i);
                       }
                   }

           }else if (array[0]==0){
               magicIndex.add(0);
           }
        }
    }

    static void magicIndexRecursive (int[] array , int offset){
       // System.out.println(Arrays.toString(array)+"-->"+offset);
            if(array==null || array.length ==0){
               return ;
            }

            if (array.length ==1){
                 if(array[0]==offset){
                     System.out.println("Magic index<> =" +offset);
                 }
                 return ;
            }
            int mid =  array.length/2;
            if (array[mid] == mid + offset){
               System.out.println("Magic index =" +(mid+ offset));
               return ;
            }
              magicIndexRecursive(Arrays.copyOfRange(array, 0, mid), offset);

              magicIndexRecursive(Arrays.copyOfRange(array, mid, array.length), offset+mid);



    }

    static void magicIndexRecursiveWithIndex (int[] array , int startIndex, int endIndex){
          System.out.println("Start Index =" +startIndex +" End Index =" +endIndex);
        int midIndex = (endIndex-startIndex)/2;
        if (midIndex==0){
            return ;
        }
        int midValue  =  array[midIndex];
        if (midIndex == midValue){
            System.out.println("Magic index =" +midValue);
            return ;
        }
        //Left search

        magicIndexRecursiveWithIndex(array, startIndex , midIndex-1);

         //Right Search
        magicIndexRecursiveWithIndex(array ,midIndex+1, endIndex);



    }
}

