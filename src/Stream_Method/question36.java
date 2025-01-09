package Stream_Method;


// Write a Java program that implement Stream to count words in a sentence.
//-----------------------------------------------------------------------------------//

public class question36 {
    public void CountWords() {
        String sentence = "Hello World";
        long count = sentence.chars().filter(c -> c == ' ').count() + 1;
        System.out.println("Number of words in the sentence: " + count);
    }
}
