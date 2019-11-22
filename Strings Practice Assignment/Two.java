public class Two    {
    public static void main(String[] args)   {
        palindrome("A man, a plan, a canal: Panama.");
    }

    public static void palindrome(String s)  {
        System.out.println(s);
        s = s.toLowerCase();
        s = s.trim();
        String forward = "";
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--)   {
            char letterr = s.charAt(i);
            if(Character.isLetter(letterr))  {
                reverse = reverse + s.charAt(i);
            }
        }
        for(int i = 0; i < s.length(); i++) {
            char letterf = s.charAt(i);
            if(Character.isLetter(letterf))  {
                forward = forward + s.charAt(i);
            }
        }
        //System.out.println(reverse);
        if(forward.equals(reverse))   {
            System.out.print("This is a palindrome");
        }   else    {
            System.out.print("This is not a palindrome");
        }
    }
}