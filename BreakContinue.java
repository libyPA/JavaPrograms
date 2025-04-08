public class BreakContinue {
    public static void main(String[] args) {
        BreakCheck();
        ContinueCheck();
    }

    private static void ContinueCheck() {
        for(int i=1;i<10;i++){
            if(i%2==0) continue;
            else System.out.print(i +" ");
        }
        System.out.println("-> All odd numbers till 10");
    }

    private static void BreakCheck() {
        int count = 0;
        for(int i=1;i<10;i++){
            if(count>=3) break;
            else if(i%2==0) {
                count++;
                System.out.print(i +" ");
            }
            else continue;
        }
        System.out.println("-> First 3 even numbers");
    }
}
