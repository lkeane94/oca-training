package academy.learnprogramming;

public class DeclaringAndInitilizingVariables {

    public static void main(String[] args) {

        //declaring and initilizing in 2 lines
        int myNumber;
        myNumber = 10; //initilization
        System.out.println("myNumber =" + myNumber);

        //declare in one line

        double myDouble = 7.50;

        System.out.println("myDouble" + myDouble);


        //comes up in exam - to try to confuse you
        float myFloat1, myFloat2, myFloat3;
        //another possibility
        float myFloat4 ; float myFloat5;
        //also legal
        float myFloat6 = 5f , myFloat7 = 10f;
        //possible
        boolean b1,b2;

        //double d1, double d2; doesnt compile

        double d1,d2;


        int i1;
        int i2;
        // int i3; i4; will not compile


       //int int = 10 // will not compile



    }
}
