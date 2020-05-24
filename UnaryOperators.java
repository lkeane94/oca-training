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
        //boolean myboolean - true does not compile
        //boolean z = !0 // does not compile

        //increment and decrement be careful , have higher order thant (+,-,*,/,...)
        //post increment and pre increment

        //increment
        int myInt = 5;
        //myInt = myInt +1;
       // int otherInt = myInt;
        int otherInt = ++myInt;
        System.out.println("myInt"+ myInt+ " otherInt="+ otherInt);

        int newInt = 5;
        int newOtherInt =  newInt++;
        System.out.println("newInt+ "+ newInt+ " newOtherInt"+ newOtherInt);


        int count = 0;
        System.out.println(count); //0
        System.out.println(++count); //1
        System.out.println(count); // 1
        System.out.println(count--); //1
        System.out.println(count); //0


        // Exam questions examples

        int e = 3;
        int f = ++e *5 / e-- +e--;

        // e = 3
        //f = 4 *5 / 4 +4
        //

        System.out.println("e= "+ e + "f = "  +  f );

        //test commit without author






    }
}
