import java.util.Scanner;

public class StringPalindrome {

    public Boolean isPalindrome(String str){
        char[] charArr=str.toCharArray();
        int end =str.length()-1;
        int start=0;
        while (start<end) {
            if(charArr[start]!=charArr[end]){
                return false;
            }            
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringPalindrome obj=new StringPalindrome();
        System.out.println("Enter the word:");
        String str=sc.next();
        System.out.println(obj.isPalindrome(str));

    }    
}
