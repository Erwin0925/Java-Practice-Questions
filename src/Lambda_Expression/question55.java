package Lambda_Expression;

// Write a Java recursive method to check if a given array is sorted in ascending order.
//-----------------------------------------------------------------------------------//

public class question55 {

    public boolean isAsc(int[] arr){
        return isAsc(arr, 0);
    }

    public boolean isAsc(int[] arr, int index){

        if (index == arr.length-1){
            return true;
        }

        if (arr[index] > arr [index + 1]){
            return false;
        }

        return isAsc(arr, index+1);
    }

    public void CheckArray(){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isAsc(arr));
    }
}
