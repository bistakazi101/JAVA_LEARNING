//multidimentional array

/**
 *
 * @author saga
 */
public class Java33_multideimentional {

    /**
     *
     * @param args
     */
    public static void main(String []args){
        System.out.println("Multidimentional array");
        int [][]array= {{1,2,3,4},{1,2,3,4}};
        int [][]array1={{1,2,3,4},{1,2,3,4}};
        int [][]array3 =new int[2][4];
        //for loop and summing the variable
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                array3[i][j]=array[i][j]+array1[i][j];
                System.out.println(array3[i][j]);
            }
        
    }
    }
}
