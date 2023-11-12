import java.util.Scanner;

/** PrimeGenerator에서 구한 소수들을 출력하기 위한 class입니다.
 * 
 */
public class PrimePrinter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int currentNum = 0;

        System.out.print("Enter upper limit: ");
        int lastNum = in.nextInt();
        
        PrimeGenerator pC = new PrimeGenerator();


        boolean space = true;

        currentNum = pC.nextPrime();
        while(space)
        { 
            System.out.print(currentNum);

            currentNum = pC.nextPrime();

            if(currentNum > lastNum)
                space = false;
            if(space) //마지막 숫자 이후에 space를 사용하지 않기 위한 방법입니다.
                System.out.print(" ");
        }
    }
}
