package LogicsProgram.Array_Strings;

public class NumberOfIsland {
    public static void main(String[] args) {
        char[][] matrix={
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(numberOfIsland(matrix));
    }
    public static int numberOfIsland(char[][] matrix){
        if(matrix==null && matrix.length==0){
            return 0;
        }
        int isLand=0;
        int row=matrix.length,col=matrix[0].length;
        for (int r = 0; r <row ; r++) {
            for (int c = 0; c < col; c++) {
                if(matrix[r][c]=='1'){
                    isLand++;
                    disable(matrix,r,c);
                }
            }
        }
        return isLand;
    }
    public static void disable(char[][] matrix,int r,int c){
        if(r<0 || c<0 ||r>=matrix.length || c>=matrix[0].length ||matrix[r][c]=='0'){
            return ;
        }
        matrix[r][c]='0';
        disable(matrix,r+1,c);
        disable(matrix,r-1,c);
        disable(matrix,r,c+1);
        disable(matrix,r,c-1);
    }
}
