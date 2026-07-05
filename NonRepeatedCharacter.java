
import java.util.HashMap;

//Find First Non Repetead
/*public class NonRepeatedCharacter{
    public static void main(String [] args){
        String str="swiss";
        HashMap <Character,Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No unique Character");
    }
}*/
public class NonRepeatedCharacter{
    //Method with Parameter
    public static  char firstNonRepeatedChar(String str){
        HashMap <Character,Integer> map=new HashMap<>();
        //count frequency of each character
        for(char ch: str.toCharArray()){
            map.put(ch,map. getOrDefault(ch, 0)+1);
        }
        //find first character with frequencey 1
        for (char ch : str.toCharArray()) {
            if(map.get(ch)==1){
                return ch;
            }
            
        }
        return '\0';//Non -repeated character
    }
        public static void main(String []args){
        String input ="swiss";
        //Method call with parameter
        char result=firstNonRepeatedChar(input);
        if (result != '\0')
        {
        System.out .print("first Non Repeated Character:"+result);
        }else {
            System.out.println("Non no-repeated character found");
        
            }
        }
}