package StringPractice;

public class Remove_the_occurence {

    public static String remove(String  input)
    {
      StringBuilder sb = new StringBuilder();
      int i = 0;
      while(i < input.length())
      {
          if(i < input.length()-1 && input.charAt(i) == 'A' && input.charAt(i+1) == 'B')
          {
              i += 2;
          }
          else if(input.charAt(i) == 'C')
          {
              i += 1;
          }
          else
          {
              sb.append(input.charAt(i));
              i++;
          }
      }
      return sb.toString();
    }

    public static void main(String[] args) {
        String str = "CBAABCAB";
        System.out.println("Before the removing the element of str "+str);
        String str1= remove(str);
        System.out.println("After removing the element of str " +str1);
    }
}
