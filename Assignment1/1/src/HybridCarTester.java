import java.util.Scanner;

public class HybridCarTester{
    /** 하이브리드 클래스를 확인하고 위한 메인문입니다.
     * 하이브리드 자동차에 대해 정보를 받고 그에 대한 결과를 출력합니다.
     */
    public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);

        System.out.print("What was the cost of the car? ");
        double c = keyIn.nextDouble();
        System.out.print("How mant miles per year will you drive the car? ");
        double m = keyIn.nextDouble();
        System.out.print("What is the cost of a gallon of gas? ");
        double g = keyIn.nextDouble();
        System.out.print("How many miles per gallon does the car average? ");
        double e = keyIn.nextDouble();
        System.out.print("What was the resale value of the car after five years? ");
        double r = keyIn.nextDouble();

        HybridCar car = new HybridCar(c, m, g, e, r);

        System.out.println("The total cost of ownership is " + car.TotalCost());
        
    }
}
