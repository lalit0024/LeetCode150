public class RandomizedSet {

    int[] set = new int[10];
    int head = 0;
    int tail = 0;

    public boolean insert(int val) {
        if (head == tail) {
            set[head]= val;
            head++;
        }else if (set[head-1] < val) {

        }
        return true ;
    }

    public boolean remove(int val) {
        return true;
    }

    public int getRandom() {
   return 1;
    }
}
