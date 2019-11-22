public class One    {
    public static void main(String[] args)   {
        input("I have a pen, I have a apple");
    }
     
    public static void input(String start)  {
        int i = start.indexOf(",");
        String first = start.substring(9, i);
        String second = start.substring(i + 11, start.length());
        String output = "Uh! " + second + " " + first + ".";
        System.out.println(start);
        System.out.print(output);
    }
}