public class StringMethods3 {
    public static void main(String[] args) {
        String regex = "apple|orange|pear";
        System.out.println("apple".matches(regex));
        String str1 = "Hello World!";
        String str2 = "Hello World2!";
        System.out.println(str1.regionMatches(0,str2,0,4));
        System.out.println(str1.replace("l","i"));
        String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String check = "(?i)cat";
        System.out.println(myStr.replaceAll(check, "dog"));
        System.out.println(myStr.replaceFirst("popular", "pretty"));
        String[] splitStringArray = regex.split("[|\\s]");
        for(String s:splitStringArray){
            System.out.println(s);
        }

    }
}
