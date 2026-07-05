//BinarySearch
/*public class BinarySearch{
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12};
        int target=8;
        int low=0;
        int high =arr.length-1;
        while(low <=high){
            int mid=(low+high)/2;
            if(arr[mid] ==target){
                System.out.println("Found at index"+mid);

                return;
            }
            if(arr[mid] <target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Target not found");
    }
}*/
public class BinarySearch{
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at index mid
            }
            if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 8;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}