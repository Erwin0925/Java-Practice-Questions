package Stream_Method;

// Write a Java program that implement Stream to check if a list of strings contains a specific word.
//-----------------------------------------------------------------------------------//

public class question39 {
    public void CheckSpecificWord() {
        String[] str = { "madam", "hello", "world" };
        boolean result = java.util.Arrays.stream(str).anyMatch("hello"::equals);
        System.out.println(result);
    }
}
