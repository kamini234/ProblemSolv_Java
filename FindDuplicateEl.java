
import java.util.HashSet;

//FindDuplicateElement
public class FindDuplicateEl{
    public static void findDuplicate(int[] arr){
HashSet<Integer> seen=new HashSet<>();
HashSet<Integer> duplicates=new HashSet<>();
for (int num:arr) {
if(!seen.add(num)){
    duplicates.add(num);
}    
}
for(int num:duplicates){
    System.out.println(num+" ");
}
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,1};
        findDuplicate(arr);
    }
}