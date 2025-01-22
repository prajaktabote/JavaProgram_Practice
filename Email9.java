//Input an email from the user you have to create username from the email by deleting the part that comes after "@" display that username to the user
import java.util.*;
class Email9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String email=sc.next();
        String username= " ";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }
}

