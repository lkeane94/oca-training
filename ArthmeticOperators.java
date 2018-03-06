package academy.learnprogramming;

public class ArthmeticOperators {
    // + - / * %
    //also include ++ -- ( increment and decrement)
    //BOMDAS applies
    public static void main(String[] args) {

        int result = 3 -2 + 2 * 2 + 3;
        // 3-2+4+3 = * goes first
        // 1+4+3
        // =8
        System.out.println("result= " + result);


        result = 4 /2 + 1 - 4 * 2 + 10;
        // 4/2 + 1 -8+10
        // 2 + 1 - 8 + 10
        // 3 - 8 + 10
        // -5 + 10
        // = 5

        System.out.println("result = " + result);


        //unary operators can be tricky on exam
        //decrement operator

        int a = 4;
        int b = 3-2 * --a; // needs to decrement ( first)  by 1  then use

        //3 - 2 * 3
        // 3 -6 = 6
        // b = -3 and a is equal to 3


        System.out.println("a "+a);
        System.out.println("b "+b);

        a = 4 ;
        b = 3 - 2 * a--;

        // 3-2 * 4  // use "a" first and THEN decrement
        //3 - 8
        // -5

        System.out.println("a" + a);
        System.out.println("b " + b);

        //Increment operator

        long c = 2;
        long d = 4 + 3 * c++; //use then increment
        // 4 + 3 * 2
        // 4 + 6
        //10
        //c =3
        //d = 10

        System.out.println("c "+ c);
        System.out.println("d" + d);

        // brackets


        result = 10-3 * (2+1)- 4 / ( 1+3);

        //10 -3 * 3 -4 / 4 ;
        // 10 -9 -4/4
        // 10 -9  -1
        // 0

        System.out.println("result= "+ result);

        //modules operator %
        //the remainder operator

        int i = 10;
        int j = 3;

        // 10 % 3 = 10 /3  = 3  -> 3*3 = 9 -> 10-9 =1

        int k = i % j; // 1

        //10%2 = 10/2 = 5 -> 2 * 5 = 10 -> 10 - 10 =0
        int e = 10 % 2;
        System.out.println("k "+ k);
        System.out.println("e "+ e);

        // can appear on exam

        int f = 12;
        int g = 5 ;
        int h = 2;

        int m = f /2 -10 % (4+3)- 2 * f%g-h*3;
        //brackets always first

        //12/2 - 10 % 7 - 2 * 12 % 5 -2 * 3;

        // 6 -3 - 24 % 5 - 6
        // 6 -3 -4 -6
        // -3 -4
        // -7




        System.out.println("m " + m);















    }
}
