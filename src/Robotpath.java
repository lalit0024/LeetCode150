public class Robotpath {


    public static void main(String[] args) {
        System.out.println(robotPaths(2,6));
    }

    static  int robotPaths (int x , int y){
        if (x==1 && y==3)
            return 0 ;
        if (x==0 && y==0)
            return 1 ;
        if (x<0 || y<0)
             return 0 ;

        return robotPaths(x-1,y) + robotPaths(x,y-1);

    }
}
