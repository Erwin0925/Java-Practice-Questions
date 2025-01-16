package Search_Sort;

// Use Binary Search to find index of the target value

public class question56 {
    public void BinarySearch(){
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int result = BinarySearchAlgo(arr,target);
        System.out.println(result);


    }

    public int BinarySearchAlgo(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            int mid = left + (right - left)/2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] > target){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
