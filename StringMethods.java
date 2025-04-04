public class StringMethods {
    public static void main(String[] args) {
        String value = "Paru is Learning Java";
        System.out.println(value.charAt(0)); // char firstValue = value.charAt(0);
        System.out.println(value.subSequence(0,5)); //start and end required
        System.out.println(value.substring(7)); //end is optional
        System.out.println(value.substring(4,7));
        System.out.println(value.codePointAt(0)); //unicode value @i
        System.out.println(value.codePointBefore(1));// unicode value @i-1
        System.out.println("Hello".compareTo("hello"));
        /* The method returns 0 if the string is equal to the other string.
        A value less than 0 is returned if the string is less than the other string (less characters)
        and a value greater than 0 if the string is greater than the other string (more characters).*/
        System.out.println("Hello".compareToIgnoreCase("hello"));
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        String firstName = "Paru";
        String secondName = "Bennu";
        System.out.println("full name is "+ (firstName.concat(secondName)));
        System.out.println(firstName.contains("li"));
        System.out.println(secondName.contentEquals("Bennu"));
        char[] arrayString = {'h','e','l','l','o'};
        String newString = "";
        newString = newString.copyValueOf(arrayString,1,2);
        System.out.println(newString);
        System.out.println(firstName.endsWith("u"));
        System.out.println(firstName.startsWith("P"));
        String myStr = "Hello %s, welcome to %d!";
        System.out.println(String.format(myStr, "Paru", 2025));

    }
}
