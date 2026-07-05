
import java.util.HashMap;

/*CountFrequency of Element
public class CountFrequencyEl{
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,2};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (int Key : map.keySet()) 
            {
                System.out.println(Key+"->"+map.get(Key));
            
        }
    }
}
*/
public class CountFrequencyEl{
    //Method Creation
    public static void countfrequency(int[] arr){
        HashMap<Integer,Integer>map=new HashMap<>();
        //count frequwncy
        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        //Print result
        for(int key:map.keySet()){ 
            System.out.println(key+"->"+map.get(key));
        }
    }
    public static void main(String[] args) {
        //Array
        int[] arr={1,2,3,4,5};
        //Method call with parameter
        countfrequency(arr);
    }
}