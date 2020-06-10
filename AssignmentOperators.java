public class AssignmentOperators {

    public static void main(String[] args){

    //    int x = 1.0;
   //     short y = 2329320392;
   //     int z = 9f;
  //      long t = 129029320329302329;

        //to cast values, inlude type you want to cast to in brackets
        // for long include L at the end to tell the compiler it is a long integer

           int x = (int)1.0;
             short y = (short)232932;
             int z = (int)9f;
              long t = 129029320329302329L;

System.out.println("x="  + x);
        System.out.println("y="  + y);
        System.out.println("z="  + z);
        System.out.println("t="  + t);

//stackover flow, wraps the value

        //overflow and underflow with byte ( -128 to 127)
    byte myByte = 127;
    byte mySecondByte = -128;
        System.out.println("myByte= " + myByte);
        System.out.println("mySecondByte= " + mySecondByte);


       // myByte = myByte +1;
        myByte++;
        //mySecondByte = mySecondByte -1;
        mySecondByte --;

//wraps around to the next lowest value and highest value
        System.out.println("myByte= " + myByte);
        System.out.println("mySecondByte= " + mySecondByte);

    }
}
