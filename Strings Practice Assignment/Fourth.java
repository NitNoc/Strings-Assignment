public class Fourth {
    public static void main(String[] args)   {
        latin(" I love starcraft");
    }

    public static void latin(String s)  {
        s = s.trim();
        while(s.length() > 0)   {
            int space = s.indexOf(" ");
            if(space > 0)   {
                if(s.length() > 2)  {
                    String front = s.substring(0, 1);
                    String back = s.substring(1);
                    System.out.println(back + front + "ay");
                }
            }
        }
    }
}