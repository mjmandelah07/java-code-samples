public class Testing {
    public static int sum(int x, int y) {
        return x + y;
    }

    public void sum1(int xx, int yy) {
        System.out.println(xx + yy);
    }

    // interger
    // string
    // char
    // boolean
    // double
    // float
    // bit
    // hashmap




    public static void main(String[] args) {
        int result = sum(3, 5);
        System.out.println(result);

        String any = "Hello";

        String result1 = "";

        // loop through the string
        // Select any from index 0 and add to result1
        for (int i = 0; i < any.length(); i++){  // length 5, i = 0, i = 1, i = 2
            result1 = any.charAt(i) + result1; // H + "" = "H", e + "H" = "eH", l + "eH" = "leH"
        }

        char[] original = any.toCharArray(); // ["H", "e", "l", "l", "0"]
    }
}
