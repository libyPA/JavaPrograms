public class ForLoop {
    public static void main(String[] args) {
        forLoop();
        forEachLoop();
    }
    public static void forLoop(){
        System.out.println("******** for loop ********");
        for(int i=0;i<=10;i++){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    public static void forEachLoop(){
        String[] fruits = {"apple","orange","mango"};
        System.out.println("******* for each loop ********");
        for(String fruit:fruits){
            System.out.print(fruit +" ");
        }

    }
}
