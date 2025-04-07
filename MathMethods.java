public class MathMethods {
    public static void main(String[] args) {
        int x =7,y=8;
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(x,y));
        System.out.println((int)Math.sqrt(9)); //gives a decimal value, so I used int to typecast
        System.out.println(Math.abs(-5));
        System.out.println(Math.random()); // 0.0<=random<1.0
        System.out.println((int)(Math.random()*101)); // 0 to 100
    }
}
