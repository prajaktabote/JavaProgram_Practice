class BackTracking{

    public static void printPermutation(String str, String perm,int idx)
    {
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
    
    
        for(int i=0;i<Str.length;i++){
            char currChar = str.CharAt(i);
            String newString = str.subString(0,i)+str.subString(i+1);
            printPermutation(str, perm + currChar,idx+1);
        }
    }
        public static void main(String args[]){
            String str="ABC";
            printPermutation(str, " ",0);
        
    }
}