package calculate;

public class Calculator
{
    int sum,sub;
    int mul,div;
    public void addition(int a, int b)
    {
        System.out.println("Addition of "+a+ " and " +b+ " is = "+sum);
    }
    public void subtraction(int a, int b)
    {
        System.out.println("Subtraction of "+a+ " and " +b+ " is = "+sub);
    }
    public void multiplication(int a, int b)
    {
        System.out.println("Multiplication of "+a+ " and " +b+ " is = "+mul);
    }
    public void division(int a, int b)
    {
        System.out.println("Division of "+a+ " and " +b+ " is = "+div);
    }
    public void calculateResult(int a, int b, char symbol)
    {
        switch (symbol)
        {
            case '+':
                sum=a+b;
                addition(a,b);
                break;
            case '-':
                 sub=a-b;
                 subtraction(a,b);
                 break;
           case '*':
                mul=a*b;
                multiplication(a,b);
                break;

           case '/':
                div=(a/b);
                division(a,b);
                break;
           default:
                System.out.println("Invalid character..");

        }
    }
}
