public class StringMethods4 {
    public static void main(String[] args) {
        String name = "Paru";
        char[] nameArray = name.toCharArray();
        System.out.println(nameArray);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toString()); //string representation of an object
        String fullName  = "   Paru Bennu   ";
        System.out.println(fullName);
        System.out.println(fullName.trim()); //trim leading and trailing whitespace
        char[] myArray = {'a', 'b', 'c'};
        System.out.println(String.valueOf(myArray)); //string representation of the specified value.
        System.out.println(String.valueOf('A'));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(4.5f));
    }
}
