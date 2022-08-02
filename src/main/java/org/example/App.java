package org.example;

/**
 * Hello world!
 */
public class App {
    public static boolean atAspectj = false;

    public static void main(String[] args) {
        test();

        if (atAspectj) {
            System.out.println("@AspectJ SUCCESS!");
        } else {
            System.err.println("@Aspectj FAILURE");
        }

        int tmp1 = 2; // change to test
    }

    public static void test() {
    }
}
