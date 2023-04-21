public class HelloWorld {

    public static void main(String[] args) {
        int myFavoriteNumber = 7;
        System.out.println("My favorite number is " + myFavoriteNumber);

        String myString = "Hello, world!";
        System.out.println(myString);


        myString = 'c';
        System.out.println(myString);


        myString = 3.14159;

        long myNumber;
        System.out.println(myNumber);


         myNumber = 3.14;  // This will result in a compile error because 3.14 is a double value and cannot be automatically converted to a long value


        myNumber = 123L;
        System.out.println(myNumber);


        myNumber = 123;
        System.out.println(myNumber);


         myNumber = 3.14;

         myNumber = 3.14f;
         myNumber = (float) 3.14;




        int x = 5;
        System.out.println(x++);
        System.out.println(x);


        int y = 5;
        System.out.println(++y);
        System.out.println(y);


        int z = 5;
        z = z + 5;
        System.out.println(z);


        int a = 5;
        a += 5;
        System.out.println(a);

        String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;

        int three = (int) "three";

        int x = 4;
        x += 5;

        int x = 3;
        int y = 4;
        y *= x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;

    }
}
