package Search_Sort;

// Use Built in sort to sort the arr and list in an ascending order

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class question59 {
    public void BuitInSort(){
        Integer arr[] = {23, 44, 12, 9, 3, 24, 58, 134, 96, 91};
        Arrays.sort(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }

        List<Integer> list = Arrays.asList(arr);
        list.sort((a,b)-> a.compareTo(b));
        for(int num : list){
            System.out.print(num + " ");
        }
    }
}
