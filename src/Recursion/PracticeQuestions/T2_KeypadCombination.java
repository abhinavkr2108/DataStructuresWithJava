package Recursion.PracticeQuestions;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the
 * number could represent. Return the answer in any order.
 * ASCII Values:
 * a-z: 97-122
 * A-Z: 65-90
 * Digit to Number => digit-'0'
 */
public class T2_KeypadCombination {
    public static void main(String[] args) {
        String dig = "23";
        String[] keypad = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combinations(dig,keypad,"");
    }

    private static void combinations(String dig, String[]keypad, String result){
        /**
         * "253" -> "2" -> 2 -> keypad[2]
         */
        if (dig.length()==0){
            System.out.print(result+ " ");
            return;
        }
        // Self Work
        int currNum = dig.charAt(0)-'0'; // int 2
        var currChoices = keypad[currNum]; // "abc"

        // Recursion
        for (int i=0; i<currChoices.length(); i++){
            combinations(dig.substring(1), keypad,result+currChoices.charAt(i));
        }
    }
}
