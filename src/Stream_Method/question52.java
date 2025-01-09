package Stream_Method;

// Write a Java program to count the number of strings in a list that start with a specific letter using streams.
//-----------------------------------------------------------------------------------//

public class question52 {
    public void CountSpecificLetter() {
        String[] str = { "madam", "hello", "world" };
        long count = java.util.Arrays.stream(str).filter(s -> s.startsWith("h")).count();
        System.out.println(count);
    }
}
