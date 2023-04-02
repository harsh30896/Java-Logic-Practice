package StringPractice;


import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {

    public static String encode(String s1)
    {
        Map<String,Integer> hmp = new HashMap<>();
        String outputString = "";
        String[] words = s1.split("");
        for(String word: words)
        {
            Integer integer = hmp.get(word);

            if(integer == null)
            {
                hmp.put(word,1);
            }
            else {
                hmp.put(word,integer+1);
            }

        }
        //System.out.println(hmp );
        for (Map.Entry<String, Integer> entry: hmp.entrySet())
        {
          outputString+=entry.getKey();
          outputString+=entry.getValue();
        }
        return outputString;
    }
    public static void main(String[] args) {
        String s1 = "AAAAAAAAAAAAAABBBBBBBCCCCCCCCCCCCCCCCAAAAAA";
        String resultString = encode(s1);
        System.out.println(resultString);
    }
}
/*
public static String encode(String s1) {
    Map<Character, Integer> hmp = new HashMap<>();
    StringBuilder outputString = new StringBuilder();
    char[] chars = s1.toCharArray();
    for (char c : chars) {
        hmp.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
    }
    for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {
        outputString.append(entry.getKey()).append(entry.getValue());
    }
    return outputString.toString();
}

 */