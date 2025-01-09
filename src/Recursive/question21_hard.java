package Recursive;

// Write a Java recursive method to generate all possible permutations of a given string. (HARD)
//-----------------------------------------------------------------------------------//

public class question21_hard {
    public void Permutations() {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    public void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
