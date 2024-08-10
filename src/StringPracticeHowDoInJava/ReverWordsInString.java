package StringPracticeHowDoInJava;

import java.util.Arrays;

public class ReverWordsInString {
    public static void main(String[] args) {
        String str = "hello this is java";
        String nString = reversedString(str);
        System.out.println(nString);
    }

//    private static String reversedString(String str) {
//        String newStr[] = str.split(" ");
//        String revString = "";
//        for(int i = 0; i< newStr.length; i++){
//           String temp= newStr[i];
//           for(int j =temp.length()-1; j >= 0; j--){
//                revString+=temp.charAt(j);
//
//           }
//           revString+=" ";
//        }
//        return revString;
//    }

    private static String reversedString(String str) {
        String newStr[] = str.split(" ");
        String result = "";

        for(int i = 0; i< newStr.length; i++){
            if(i == newStr.length-1 ){
                result += newStr[i];
            }
        }
       return result;
    }

}
