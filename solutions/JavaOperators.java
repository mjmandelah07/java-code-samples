public class JavaOperators {
    public static void main(String[] args) {
        // Operators are used to perform operations on variables and values.
        int x = 100 + 50;

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        // Java divides the operators into the following groups:

        // Arithmetic operators
        // Assignment operators
        // Comparison operators
        // Logical operators
        // Bitwise operators

        // 1. Arithmetic Operators
        // are used to perform common mathematical operations.

        // +	Addition	    Adds together two values
        // -	Subtraction	    Subtracts one value from another
        // *	Multiplication	Multiplies two values
        // /	Division	    Divides one value by another
        // %	Modulus	        Returns the division remainder
        // ++	Increment	    Increases the value of a variable by 1
        // --	Decrement	    Decreases the value of a variable by 1

        // 2. Java Assignment Operators
        //  are used to assign values to variables.
        int assign = 10;

        // The addition assignment operator (+=) adds a value to a variable:
        assign += 5;

        // list of all assignment operator

        // Operator	Example	same As
        // =	    x = 5	x = 5
        // +=	    x += 3	x = x + 3
        // -=	    x -= 3	x = x - 3
        // *=	    x *= 3	x = x * 3
        // /=	    x /= 3	x = x / 3
        // %=	    x %= 3	x = x % 3
        // &=	    x &= 3	x = x & 3
        // |=	    x |= 3	x = x | 3
        // ^=	    x ^= 3	x = x ^ 3
        // >>=	    x >>= 3	x = x >> 3
        // <<=

        // 3. Java Comparison Operators
        // are used to compare two values (or variables).
        // This is important in programming, because it helps us find answers and make decisions.

        int xx = 5;
        int yy = 3;
        System.out.println(xx > yy); // returns true, because 5 is higher than 3

        // Operator	Name
        // ==	    Equal to
        // !=	    Not equal
        // >	    Greater than
        // <	    Less than
        // >=	    Greater than or equal to
        // <=	    Less than or equal to

        // 4. Java Logical Operators
        // You can also test for true or false values with logical operators.

        // Operator	Name	    Description
        // && 	    Logical and	Returns true if both statements are true
        // || 	    Logical or	Returns true if one of the statements is true
        // !	    Logical not	Reverse the result, returns false if the result is true
    }

}
