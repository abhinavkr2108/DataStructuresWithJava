package Strings;

public class T5_ReverseWordsInString {
    public static void main(String[] args) {
        String string = "Hello World";
        String rev = reverseWords(string);
        System.out.println(rev);
    }

    private static String reverseWords(String string){
        String[] words = string.trim().split("\\s+");
        StringBuilder sBuilder = new StringBuilder("");

        for (int i = words.length-1; i >= 0; i--) {
            sBuilder.append(words[i]);
            if (i!=0) {
                sBuilder.append(" ");
            }
        }

        return sBuilder.toString();
    }
}
