public class fizzBuzz {

    public static void fizzBuzz(int n)
    {
        for(int i = 1; i <=n; i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.print("FizzBuzz ");
            }
            else if(i%3 == 0)
            {
                System.out.print("Fizz ");
            }
            else if(i%5 ==0)
            {
                System.out.print("Buzz ");
            }
            else
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void fizzBuzzrecursive(int n)
    {

        if(n == 1)
        {
            System.out.print("1 ");
        }
        else
        {
        fizzBuzzrecursive(n-1);
        
            if(n%3 == 0 && n%5 == 0)
            {
                System.out.print("FizzBuzz ");
            }
            else if(n%3 == 0)
            {
                System.out.print("Fizz ");
            }
            else if(n%5 ==0)
            {
                System.out.print("Buzz ");
            }
            else
            {
                System.out.print(n + " ");
            }
        }
        
        
    }
        public static void main(String [] args)
        {
            fizzBuzz(15);
            System.out.println();
            fizzBuzzrecursive(15);
        }
        }

