public class ArraysMultiDimension {
    public static void main(String[] args) {
        int[][] values = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Value @ 2nd row and 2nd column -> "+values[1][1]);
        values[1][1]=1;
        System.out.println("Value @ 2nd row and 2nd column -> "+values[1][1]);
        System.out.println("Multi Dimension values using for loop");
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values[i].length;j++){
                System.out.print(" "+values[i][j]);
            }
            System.out.println();
        }
        System.out.println("Multi Dimension values using foreach loop");
        for(int[] row:values){
            for(int column:row){
                System.out.print(" "+column);
            }
            System.out.println();
        }
    }
}
