public class ArraysSingleDimension {
    public static void main(String[] args) {
        int[] oddNum = {2,4,6,8,10};
        String[] fruits = {"apple","orange","kiwi","banana"};
        System.out.println("index 2 -> "+fruits[2]);
        fruits[2]="Pear";
        System.out.println("index 2 -> "+fruits[2]);
        System.out.println("Length of fruit array -> "+fruits.length); //num of element
        System.out.println("Array elements using for loop");
        for(int i=0;i<fruits.length;i++){
            System.out.print(" "+fruits[i]);
        }
        System.out.println();
        System.out.println("Array elements using foreach loop");
        for(String fruit:fruits){
            System.out.print(" "+fruit);
        }
    }
}
