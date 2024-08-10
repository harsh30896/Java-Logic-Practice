package StringPractice;

public class ReverseString {
    public static void main(String args[]) {
        String reversedString = reverseString("hello world");
        System.out.println(reversedString);
    }

    public static String reverseString(String s) {
        StringBuilder ans = new StringBuilder();
        String temp = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                if (!temp.equals("")) {
                    ans.insert(0, temp + " ");
                }
                temp = "";
            } 
            else {
                temp += ch;
            }
        }
        
        // Add the last word to the answer
        if (!temp.equals("")) {
            ans.insert(0, temp);
        }
        
        // Remove the trailing space if there is one
        if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') {
            ans.setLength(ans.length() - 1);
        }

        return ans.toString();
    }
}
