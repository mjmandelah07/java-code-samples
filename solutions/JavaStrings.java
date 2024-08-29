public class JavaStrings {
    public static void main(String[] args) {
        // Java Strings
        //  are used for storing text.
        // A String variable contains a collection of characters surrounded by double quotes

        // Create a variable of type String and assign it a value
        String greeting = "Hello";

        // String Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // The length of the txt string is: 26
        System.out.println("The length of the txt string is: " + txt.length());

        // More String Methods
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        // Finding a Character in a String
        // The indexOf() method returns the index (the position)
        // of the first occurrence of a specified text in a string (including whitespace):
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        // String Concatenation
        // The + operator can be used between strings to combine them.
        // This is called concatenation:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        // You can also use the concat() method to concatenate two strings:
        System.out.println(firstName.concat(lastName));

        // Adding Numbers and Strings
        // WARNING!
        //
        //Java uses the + operator for both addition and concatenation.
        //
        //Numbers are added. Strings are concatenated.

        // If you add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)

        // If you add two strings, the result will be a string concatenation:
        String xx = "10";
        String yy = "20";
        String zz = xx + yy;  // zz will be 1020 (a String)

        // If you add a number and a string, the result will be a string concatenation:
        String xxx = "10";
        int yyy = 20;
        String zzz = xxx + yyy;  // zzz will be 1020 (a String)

        // Strings - Special Characters
        // Because strings must be written within quotes,
        // Java will misunderstand this string, and generate an error:

        // String txt = "We are the so-called "Vikings" from the north."; [ will cause error ]

        // The solution to avoid the above problem, is to use the backslash escape character
        // The backslash (\) escape character turns special characters into string characters

        // Escape character	Result	        Description
        // \'	             '	            Single quote
        // \"	             "	            Double quote
        // \\	             \	            Backslash

        // The sequence \"  inserts a double quote in a string:
        String txt3 = "We are the so-called \"Vikings\" from the north.";

        // Other common escape sequences that are valid in Java are:
        //
        // Code	Result
        // \n	New Line
        // \r	Carriage Return
        // \t	Tab
        // \b	Backspace
        // \f	Form Feed
    }
}
