public class firstJavaHW {
    public static void main(String[] args) {

// Java get started
        System.out.println("Yeeerrrr whats going on??????!!!");

        // Java syntax
        //everything that needs to be printed should be inside of a class.
        //Everything needs to be inside of a main method.
        //the system.out.println("..") prints out anything inside of here.

        // Java Variables
        // diff type of vars: string, int, double(this stores numbers with decimals), char (this stores single characters like 'A' or 'c'
        // boolean ( this stores two value states ,true or false)
        // in order to make something final literally put final before whatever

        String helloStatement = "This is a welcome to my notes, feel free to give me feedback";
        System.out.println(helloStatement);

        double firstDecimal = 23.78;
        System.out.println(firstDecimal);

        char test ='D';
        System.out.println(test);

        final int myNum = 23;
       // this would not run due to the above myNum= 43;

        // Java Data types
        //there are primitive data types and then non-primitive
        // the eight primitive types are : byte, short, int, long, float, double, boolean, char

//byte can only store low
        byte myByte = 120;
        System.out.println(myByte);
        //short prints out high numbers
        short myShort = 3567;
        System.out.println(myShort);

        // int is probably the best way
        int myInt = 4899101;
        System.out.println(myInt);

        // float is used for digit numbers and remember to place an 'f' at the end
         float myFloat = 2.0901f;
        System.out.println(myFloat);

        //double is almost the same just end with 'd' this is way safer than float because it allows for 16 more digits

//Type Casting
        //when doing this you are assigning one primitive data type to another.
        //ex below for widening casting


        int myInt2 = 8;
        double myDouble2 = myInt2;
        System.out.println(myInt2);
        System.out.println(myDouble2);
// this basically converted myInt2 into a decimal number as well
        //example bellow for narrow casting

        double myDouble =9.78d;
        int myInt3 = (int) myDouble;
        System.out.println(myDouble);
        System.out.println(myInt3);

   //Operators
        //there are tons of different operators. Arithmetic operators
        //Assignment operators
        //Comparison operators
        //Logical operators
        //Bitwise operators

 // strings
     //strings are used for storing texts
     // strings can contain methods in them

     String lengthofStringy = "hi my name is raul and its very nice to meet you.\n";
        System.out.println(lengthofStringy + lengthofStringy.length());

      // \n would make a new line wherever placed

 // MATH
      // this is key
         int randomNum = (int)(Math.random()* 51); // this generates a random number from 0 to 50
        System.out.println(randomNum);


    }
}

