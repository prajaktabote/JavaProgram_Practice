//create a java program to add two matrices of sign 2*3
public class Array784{
    public static void main(String args[]){
        int mat1[][]={{1,2,3},
                      {4,5,6}};

        int mat2[][]={{2,3,5},
                       {5,9,0}};

        int [][] result= {{0,0,0},
                        {0,0,0}};

        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("setting value for i=$d and j=%d\n" ,i,j);
                result[i][j]=mat1[i][j]+mat2[i][j];


            }
        }

    }
}