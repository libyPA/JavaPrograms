public class IfElseLoop {
    public static void main(String[] args) {
        int mark = 80;
        if (mark >= 80) {
            System.out.println("First Class Honours");
        } else if (mark >= 60) {
            System.out.println("Second Class Honours");
        } else {
            System.out.println("Distinction");
        }
        ternaryExample();
    }

    public static void ternaryExample(){
        //variable = (condition) ? expressionTrue :  expressionFalse;
        //ternary operator or short hand if-else
        String name = "Paru";
        Boolean married = true;
        String title = (married) ? "Mrs." : "Ms";
        System.out.println(String.format("My name is %s%s", title,name));
    }
}
