public class ReverseArray{
    public static void reversAarray(int [] arr){
int left=0;
int right=arr.length-1;
while(left<right){
    int temp=arr[right];
    arr[left]=arr[right];
    arr[right]=temp;
    left--;
    right++;
}
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //Call Method
        reversAarray(arr);
        for (int num: arr) {
            System.out.println(num+" ");
            
        }
    }
}
