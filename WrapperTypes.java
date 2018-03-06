package academy.learnprogramming;

public class WrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;
        //every primitive type has a wrapper type. All wrapper class starts with Capital letter

        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");

        //Integer can hold null but int cannot be null

        Integer myInteger5 = null;

        //int myInt2 = null; primatives cannot be null

        System.out.println("myIn");


        int myInt3 = myInteger3;// unboxing

        Integer myInteger6 = new Integer(10); //boxing
        Integer myInteger7 = myInt; //boxing

        int myInt4 = myInteger5; //integer 5 is initilized to null. throws null pointer exception

        //autoboxing

        printSum(1,5);
        printSum (3,9);


    }

    public static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum "+ sum );

    }
}
