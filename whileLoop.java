public class whileLoop {
    public static void main(String[] args) {
        whileLoopCheck();
        doWhileLoopCheck();
    }
    public static void whileLoopCheck(){
        int day = 1;
        while(day<10){
            System.out.print(day++ +" ");
        }
        System.out.println("end of while loop");
    }
    public static void doWhileLoopCheck(){
        int day = 1;
        do{
            System.out.print(day++ +" ");
        }while(day<10);
        System.out.println("end of do while loop");
    }
}
