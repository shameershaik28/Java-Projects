// Create a public class called Calculator
public class Calculator{
    Calculator()
    {

    }
    public int add(int a, int b)
    {
        int sum= a+b;
        System.out.println(sum);
        return sum;

    }
    public int subtract(int a, int b)
    {
        int sub= a-b;
        System.out.println(sub);
        return sub;
    }
    public int multiply(int a, int b)
    {
        int M= a*b;
        System.out.println(M);
        return M;
    }
    public int divide(int a, int b)
    {
        int d= a/b;
        System.out.println(d);
        return d;
    }
    public int modulo(int a, int b)
    {
        int MOD= a%b;
        System.out.println(MOD);
        return MOD;
    }

    public static void main(String[] arg)
    {
        Calculator myCalculator= new Calculator();
        myCalculator.add(5, 7);
        myCalculator.subtract(45, 11);
        myCalculator.multiply(2, 4);
        myCalculator.divide(4, 2);
        myCalculator.modulo(10, 4);






    }

}