public class Third  {
    public static void main(String[] args)   {
        binary(1234);
    }
    
    public static void binary(int n) {
        String f = "";
        while(n > 0)    {
            int number = n % 2;
            n = n / 2;
            f = number + f;
        }
        System.out.print(f);
    }
}