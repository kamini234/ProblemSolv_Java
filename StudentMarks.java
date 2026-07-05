import java.util.HashMap;
import java.util.Map;
public class StudentMarks{
    public static void show(){
        Map<String,Integer> marks=new HashMap<>();
marks.put("Math", 85);
marks.put("Science", 90);
marks.put("English", 88);
System.out.println(marks);
    }
public static void main(String[] args) {
    show();
}
}