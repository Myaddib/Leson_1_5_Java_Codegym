package basic.java_codegym;

public class Main {

    public static void main(String[] args) {
	// write your code
        //1_5__1
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);

        //1_5__2
        int a = 3;
        int b = 2;

        //System.out.print("two");
        System.out.print(b);
        System.out.print(" plus ");
        //System.out.print(" minus ");
        System.out.print(a);
        //System.out.print("three");
        System.out.print(" is equal to ");
        //System.out.print(" equals ");
        //System.out.print("five");
        System.out.print(a + b);

        System.out.println();

        //1_5__3
        // String s = "Merry";
        // System.out.println("Christmas");
        // System.out.println("Merry New");
        // System.out.println("weekend");
        System.out.print("Happy New");
        // System.out.println("weekend");
        // System.out.println(s);
        // System.out.print("Merry New!");
        System.out.print(" ");
        System.out.println("Year");

        //1_5__4
        a = 3;
        //int a = 10;
        b = 6;
        //int b = 12;
        //int sum = 1 + a + b;
        //int sum = 2 + a + b;
        int sum = 3 + a + b;
        //int sum = 4 + a + b;

        System.out.println("sum = " + sum);
    }
}
