public class StringMethods2 {
    public static void main(String[] args) {
        String myString = "Hello";
        byte[] stringToByteArray = myString.getBytes();
        // System.out.println(stringToByteArray); gives memory loc value
        System.out.println(stringToByteArray[1]);

        //getChars copies chararcter from a string to a char array
        char[] charArray = {'h','f','r','2','4'};
        System.out.println(charArray);
        myString.getChars(0,2,charArray,3);
        System.out.println(charArray);
        System.out.println(myString.hashCode());
        System.out.println(myString.indexOf("l"));
        System.out.println(myString.lastIndexOf("l"));
        System.out.println(myString.isEmpty());
        String fruitsList = String.join(",","apple","orange","pear");
        System.out.println(fruitsList);
        System.out.println(fruitsList.length());
    }
}
