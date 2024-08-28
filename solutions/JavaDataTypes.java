public class JavaDataTypes {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        // Data types are divided into two groups:

        // Primitive data types - byte, short, int, long, float, double, boolean and char
        // Non-primitive data types - String, Arrays and Classes

        // Primitive Data Types
        // A primitive data type specifies the size and type of variable values, and it has no additional methods.
        // There are eight primitive data types in Java:

        // byte	    1 byte	Stores whole numbers from -128 to 127
        // short	2 bytes	Stores whole numbers from -32,768 to 32,767
        // int	    4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        // long	    8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        // double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        // boolean	1 bit	Stores true or false values
        // char	    2 bytes	Stores a single character/letter or ASCII values

        // Java Numbers
        // Primitive number types are divided into two groups

        // Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
        // Valid types are byte, short, int and long.
        //
        // Floating point types represents numbers with a fractional part, containing one or more decimals.
        // There are two types: float and double.

        // Integer Types
        // 1. Byte - The byte data type can store whole numbers from -128 to 127.
        byte myByteNum = 100;
        System.out.println(myByteNum);

        // 2. Short - The short data type can store whole numbers from -32768 to 32767
        short myShortNum = 5000;
        System.out.println(myShortNum);

        // 3. Int - The int data type can store whole numbers from -2147483648 to 2147483647.
        int myIntNum = 100000;
        System.out.println(myIntNum);

        // 4. Long - The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        long myLongNum = 15000000000L;
        System.out.println(myLongNum);

        // 5. Floating Point Types
        // The float and double data types can store fractional numbers.
        // end the value with an "f" for floats and "d" for doubles

        // Float example
        float myFloatNum1 = 5.75f;
        System.out.println(myFloatNum1);

        // Double Example
        double myDoubleNum = 19.99d;
        System.out.println(myDoubleNum);

        // Scientific Numbers
        // A floating point number can also be a scientific number with an "e" to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        // 6.  Boolean Types
        // Java has a boolean data type, which can only take the values true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

        // 7. Characters
        // The char data type is used to store a single character.
        char myGrade = 'B';
        System.out.println(myGrade);

        // display characters using ASCII
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

    }
}
