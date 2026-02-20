package Singleton;

public class Driver {
    public static void main(String[] args) {
        SimpleSingleton s = SimpleSingleton.getInstance();
        SimpleSingleton s1 = SimpleSingleton.getInstance();

        System.out.println(s);
        System.out.println(s1);
    }
}
