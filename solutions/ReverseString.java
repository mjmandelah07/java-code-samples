public class ReverseString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        StringBuilder reversedStr = new StringBuilder();
        System.out.println("Original string: " + originalStr);

        for (int i = 0; i < originalStr.length(); i++){
            reversedStr.insert(0, originalStr.charAt(i));
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}
