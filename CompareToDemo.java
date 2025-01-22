import java.util.*;
class CompareToDemo
{
    static int myStrLen(String str1){
            char arr[] = str1.toCharArray();
            int count =0;
            for(int i =0;i<arr.length; i++){
                count++;
            }
            return count;
        }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");

        String str1 = sc.next();
        String str2 = sc.next();

        int len1 = myStrLen(str1);
        System.out.println(len1);

        int len2 = myStrLen(str2);
        System.out.println(len2);

        
        
    }
}