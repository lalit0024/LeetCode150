import java.util.Arrays;

public class CircularArray {

    private Integer[] array;
    private int head =0 ;


    public CircularArray(int capacity) {
        array = new Integer[capacity];
    }

    public void add(Integer value) {
        array[head% array.length] = value;
        head++;

    }

    public Integer remove () {

        Integer result = array[head%array.length];
        head--;

       return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        CircularArray circularArray = new CircularArray(5);
        circularArray.add(1);
        circularArray.add(2);
        circularArray.add(3);
        System.out.println(circularArray);
        circularArray.add(4);
        System.out.println(circularArray);
        circularArray.add(5);
        System.out.println(circularArray);
        circularArray.remove();
        System.out.println(circularArray);
        circularArray.add(6);
        System.out.println(circularArray);
        circularArray.add(6);
        circularArray.add(6);
        System.out.println(circularArray);



    }
}
