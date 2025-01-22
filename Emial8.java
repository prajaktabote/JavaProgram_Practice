import java.util.*;
class Email8{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String email=sc.next();
        String username=" ";

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
        }
        System.out.println(username);
    }
}