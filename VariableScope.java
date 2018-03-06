package academy.learnprogramming;

public class VariableScope {


    static int myNewInt = 5; //global variable

    public static void main(String[] args) {

        //scope = range in which something is available

        //exam {} = entered new block of code

        //only avaailable within the method
        int myLocalInt = 10;
        {
         //variables declared here will only be accessable within this code block
            int myOtherInt = 20;
            System.out.println("myOtherInt " + myOtherInt);
            System.out.println("incodeblock myLocalInt "+ myLocalInt);


        }

        //System.out.println("myotherInt" + myOtherInt); dont have access to this variable


        int myOtherInt = 30; // my outer int , will print this as it is available
        System.out.println("myOtherInt "+ myOtherInt);
    }

     public static void myMethod () {


     }
}
