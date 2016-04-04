public class ExInterface3 implements HelloWorld {
    public void sayHello(int x) { // Method body
        for (int i = 0; i < x; i++) {
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        System.out.println(COUNTRY); // simple name from interface
        ExInterface3 object1 = new ExInterface3(); // new object
        object1.sayHello(5); // run from implemented class
    }
}
