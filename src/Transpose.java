public class Transpose
{
    public static void main(String []args)
    {
        int row=2,col=3;
        int [][] matrix={{2,3,4},{5,6,7}};
        display(matrix);   /*original matrix*/
        int [][] transpose= new int[col][row];
        for(int i=0;i<row;++i){
            for(int j=0;j<col;++j){
                transpose[j][i]=matrix[i][j];
            }
        }
        display(transpose); /*transpose matrix*/
    }
    public static void display(int[][] matrix){
        System.out.println("The Transpose of a matrix is");
        for(int [] row:matrix){
            for(int col:row){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
