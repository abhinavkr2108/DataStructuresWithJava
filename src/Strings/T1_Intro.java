package Strings;

public class T1_Intro {
    public static void main(String[] args) {
        String name1 = "Abhinav";
        String name2 = name1;
        name2 = "Kumar";

        System.out.println("Name 1:");
        System.out.println(name1);
        System.out.println("Name 2:");
        System.out.println(name2);

        String val1 = "Val";
        String val2 = "Val";

        System.out.println(val1==val2);

        String email = "abhinav@gmail.com";
        String companyName = companyNameFromEmail(email);
        System.out.println("Company Name: " + companyName);
    }

    private static String companyNameFromEmail(String email){
        String[] emailArray = email.split("@");
        String lastArray = emailArray[emailArray.length-1];
        int dotIdx = lastArray.lastIndexOf('.');
        return lastArray.substring(0, dotIdx);
    }
}
