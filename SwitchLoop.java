public class SwitchLoop {//Java 14 onwards
    public static void main(String[] args) {
    int day =1;
    String dayName = switch(day){
        case 1 -> "Monday";
        case 2-> "Tuesday";
        default -> "Wrong Input";
        };
        System.out.println(dayName);
        System.out.println(check(2));
    }
    public static String check(int day){
        return switch(day){
            case 1 -> "Monday";
            case 2-> "Tuesday";
            default -> "Wrong Input";
        };
    }
}
