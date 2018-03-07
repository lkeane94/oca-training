package academy.learnprogramming;

public class UnaryOperators {
    public static void main(String[] args) {
        int x = +3; // + sign is redundant
        System.out.println("x = "+ x);

        double y = -x;
        System.out.println("x = "+ y);

        //unary minus operator
        y = -y; // -1 * y
        System.out.println("x "+ x + "y " + y);



        boolean a = true;
        boolean b = !a;

        System.out.println("a "+ a + " b "+ b);

        //inverting only works with the booleans

        b = !b;
        System.out.println("a "+ a + "  b "+ b);



        //int myInt = !5; does not compile , could come up on exam to trick you.

       

    }
}
