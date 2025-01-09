package Stream_Method;

// Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
//-----------------------------------------------------------------------------------//

public class question53 {
    public void SortString() {
        java.util.List<String> str = java.util.Arrays.asList("John","Apple","Zebra","Banana");
        str.forEach(item -> System.out.print(item + " "));

        System.out.println("\nSorted in Ascending Order: ");
        str.stream().sorted().forEach(item -> System.out.print(item + " "));

        System.out.println("\nSorted in Descending Order: ");
        str.stream().sorted((str1, str2) -> str2.compareToIgnoreCase(str1)).forEach(item -> System.out.print(item + " "));
    }
}
