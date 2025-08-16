public class CircularArrayIteration {

    public static void main(String[] args) {



        int[] arr = {1, 2, 3, 4, 5};
        int x = 2;
        int y = 15;
        for (int i = x; i < y; i++) {
           System.out.println(arr[x%arr.length]);
           x++;

        }
    }
}
