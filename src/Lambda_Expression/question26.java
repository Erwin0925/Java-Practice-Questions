package Lambda_Expression;

// Write a Java program to implement a lambda expression to check if a given string is empty.
//-----------------------------------------------------------------------------------//

public class question26 {
    public void CheckEmptyString() {
        CheckEmptyString checkEmptyString = (str) -> str.isEmpty();
        System.out.println(checkEmptyString.isEmpty("madam"));
    }

    interface CheckEmptyString {
        boolean isEmpty(String str);
    }
}
