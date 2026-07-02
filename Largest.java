//Find Secondlargest Number
public class Largest {
    public static int  findLargest(int[] arr) {
        int max = arr[0];
    for (int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
    }

    public static void main(String[] args) {
        int [] arr ={10,20,30,50,8,9};
        int Largest =findLargest(arr);

        System.out.println("Largest Element=" + Largest);
    }
    }