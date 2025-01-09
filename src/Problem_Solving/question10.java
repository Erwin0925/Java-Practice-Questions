package Problem_Solving;

// Write a Java program to find a number that appears only once in a given array of integers. All numbers occur twice.
// Example: {10,2,38,23,38,23,21}
// Output: 23

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class question10 {

    public void FindNumberAppearsOnce(){
        int[] num = {1,1,2,2,3,4,4,5,5,8};

        Map<Integer, Integer> numcount = new HashMap<>();

        for (int j : num) {
            numcount.put(j, numcount.getOrDefault(j, 0) + 1);
        }

        ArrayList<Integer> num2 = new ArrayList<>();
        numcount.forEach((key,value)->{
            if (value ==1){
                num2.add(key);
            }
        });

        for (var num3 : num2) {
            System.out.print(num3 + " ");
        }
    }
}
