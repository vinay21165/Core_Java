public class twoDarray {
    public static void main(String[] args) {
        int [] []myArr= new int[2][3];
        int [][]arr = {{2,3,4},{5,6,7},{8,9,1}};
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               System.out.print (arr[i][j]+" ");
            }
            System.out.println( );
        }
    }
}
