public class PrimeGenerator {
    
    private int number;

    /** PrimeGenerator class의 기본 생성자입니다.
     * number를 1로 초기화 해줍니다.
     */
    public PrimeGenerator()
    {
        number = 1;
    }

    /** 입력값을 받았을 때 그 입력값이 소수인지 아닌지를 판단해주는 메소드입니다.
     * 
     * @param num 소수인지 아닌지 판단하려는 int형 숫자를 넣어줍니다.
     * @return 소수면 true 아니면 false를 리턴합니다.
     */
    public static boolean isPrime(int num)
    {
        if (num <= 1)
            return false;
        else if(num == 2)
            return true;
        else
        {
            for (int i = 2; i < num; i++)
            {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }

    /** number값에서 1씩 더하면서 소수인지 아닌지를 판단하고 소수라면 return 해주는 메소드입니다.
     * 
     * @return 그 전 소수인 number보다 큰 숫자중 가장 작은 소수를 return해줍니다.
     */
    public int nextPrime()
    {
        number ++;
        while (!(isPrime(number)))
            number += 1;
        return number;
    }

}
