package arithfun;
 import arithfun.Addition99;
public class Addition99{
    int num1,num2=0;
    public Addition99(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    } 
    void add(){
    }
    }
   
    class Client{
        public static  void main(String args[]){
            int x=35;
            int y=25;
            Addition99 obj=new Addition99(x,y);
            obj.add();
        }
    }