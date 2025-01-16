package Search_Sort;

// Use Bubble  Sort to sort the arr in an ascending order

public class question58 {
    public void BubbleSort(){
        int arr[] = {23, 44, 12, 9, 3, 24, 58, 134, 96, 91};
        BubbleSortAlgo(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public void BubbleSortAlgo(int[]arr){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j<arr.length-1-i; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}



