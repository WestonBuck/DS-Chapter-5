
public class Main {

    public static void main(String[] args) {
        String s = "mrowlatemymetalworm";
        String t = "lever";
        boolean first; boolean second;

        first = palindrome(s);
        second = palindrome(t);

        if (first == true)
        {
            System.out.println(s + " is a Palindrome");
        }
        else if (first == false)
            System.out.println(s + " is not a palindrome");

        if (second == true)
        {
            System.out.println(t + " is a Palindrome");
        }

        else if (second == false)
            System.out.println(t + " is not a palindrome");
    }

    public static boolean palindrome (String s)
    {
        //if its only 1 letter, it can't be different. If it's 0, its not really a word.
        if (s.length() == 0)
        {
            return false;
        }
        else if (s.length() == 1)
        {
            return true;
        }


        else if (s.charAt(0) == s.charAt(s.length()-1))
        {
            //pass same string but shift up one.
            return palindrome(s.substring(1, s.length()-1));
        }

        return false;
    }
}
