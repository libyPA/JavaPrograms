public class TypeCasting {
    public static void main(String[] args) {
        TypeCasting newCasting = new TypeCasting();
        System.out.println("Automatic Casting, int->double");
        newCasting.automaticCasting();
        System.out.println("Manual Casting, double->int");
        newCasting.manualCasting();

    }
    void automaticCasting(){
        int valueInt = 9;
        double valueDouble  = valueInt; // Automatic casting, int to double
        System.out.println("int value is "+valueInt);
        System.out.println("double value is "+valueDouble);
    }
    void manualCasting(){
        double valueDouble = 3.95d;
        int valueInt = (int) valueDouble; // manual casting, double to int
        System.out.println("double value is "+valueDouble);
        System.out.println("int value is "+valueInt);
    }
}
