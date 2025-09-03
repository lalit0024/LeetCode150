 public class MyObject {
        String name;

        public MyObject(String name) {
            this.name = name;
        }
    }

     class Example {
        public static void main(String[] args) {
            MyObject obj = new MyObject("Original");
            changeObject(obj);
            System.out.println("Original object name after method call: " + obj.name); // Output: Original object name after method call: Modified
        }

        public static void changeObject(MyObject o) {
            o.name = "Modified"; // Modifies the object's state through the copied reference
        }
    }