//Check if String is Palindrome
public class Paliandrom{

 //Create Method  
public static boolean isPalindrome(String str) {
    //Array Indexing Starte 0
    int left = 0;
    int right = str.length() - 1;
    //Condition check
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
           
        }
        //Increment Operator
        left++;
        //Decrement Operator
        right--;
        //Condtion Check True
        return true;
    }
    //Condtion false
    return false;
}
//Main Method
        public static void main(String[] args) {
            String str="madam";
            System.out.println(isPalindrome(str));
        }

    }
