package academy.learnprogramming;

public class NumericPromotion {

    public static void main(String[] args) {

        //numeric promotion rules
        //1 . When two values have different data types, Java will auto promote one fo the values to the larger data type
        //2 . when one fof the values is integral and the other is floating-point . Java will auto promote the intergral ( byte, short, int ,long ) value to the floating-point ( float , double) values dta type
        //3. Small data types ( byte, short,and char) , are first promoted to int any time they are used with binary arithmetic operator, even when neither of the operands is int
        //4.  After all promotion has finished and the operands are the same data type ( e.g. all double) , the result value will have the same data type as its promoted operands


        //int x = 5;
        //double y = 10.55;

        //System.out.println("x+y " + x + y);
       // double result = x+y;
        //System.out.println("x+y = " + (x+y));


        //byte b = 10;
        int c = 5;
        double d = 4.5;
        //double result = b+c+d;
       // System.out.println("result = "+ result);


        //Casting , opposite of promotion
        //Casting is converting bigger into smaller types
        //be carefult when casting result as you can lose precision

        double mydouble = 5.55;
        int myInt = 4 + (int)mydouble;

        System.out.println("result = "+myInt);

        int anotherInt = 125;
        int myByte = 15;

        int intResult = anotherInt +myByte;

        byte byteResult = (byte) (anotherInt + myByte);

        System.out.println("int result "+ intResult);
        System.out.println(("byte result " + byteResult)); // overflow




        //possible exam questions ( Numeric Promotion
        //Question 1
        //what is the data type of x +y?
        // double x = 4425;
        //float y = 3.35

        double x = 4425;
        //float y  = (3.35); will not compile

        //System.out.println("result"+ (x+y));


        //Question 2
        //What is the data type of x/y
        //both will get promoted to double

        //short a =14;
        //short b =6;

        //System.out.println("result "+ (a/b));


        //3. What is the data type of k * l/m?

        short k = 14; // will be promoted to int // which will then be promoted to double
        float y = 13f; // will be promoted to double
        double z = 30; // double



    }
}
