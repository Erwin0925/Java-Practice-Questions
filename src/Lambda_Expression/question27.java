package Lambda_Expression;

// Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
//-----------------------------------------------------------------------------------//

public class question27 {
    public void ConvertString() {
        ConvertString convertString = (str) -> {
            String result = "";
            for (String s : str) {
                result += s.toUpperCase() + " " + s.toLowerCase() + " ";
            }
            return result;
        };
        String[] str = { "madam", "hello", "world" };
        System.out.println(convertString.convert(str));
    }

    interface ConvertString {
        String convert(String[] str);
    }
}
