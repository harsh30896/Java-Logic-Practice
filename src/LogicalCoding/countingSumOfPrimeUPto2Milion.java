package LogicalCoding;

public class countingSumOfPrimeUPto2Milion {
    public static void main(String[] args)
    {
        long sum = 0;
        for(long i = 0; i < 2000000; i++ )
        {
            if(checkForPrime(i))
            {
                sum+=i;
            }

        }
        System.out.println(sum);
    }

        static boolean checkForPrime(long inputNumber)
        {
            boolean isItPrime = true;

            if(inputNumber <= 1)
            {
                isItPrime = false;

                return isItPrime;
            }
            else
            {
                for (long i = 2; i<= inputNumber/2; i++)
                {
                    if ((inputNumber % i) == 0)
                    {
                        isItPrime = false;

                        break;
                    }
                }

                return isItPrime;
            }
        }
}
