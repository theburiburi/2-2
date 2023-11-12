import java.util.Scanner;

public class MileagueDemo {
    public static void main(String[] args){
        Scanner keyIn = new Scanner(System.in);
        double gas, efficiency, price, cost, currently;
        
        System.out.print("Enter the number of gallons of gas in the tank: ");
        gas = keyIn.nextDouble();

        System.out.print("Enter the fuel efficency (miles per gallon): ");
        efficiency = keyIn.nextDouble();

        System.out.print("Enter the price of gas per gallon (in US $): ");
        price = keyIn.nextDouble();

        cost = 100.0 / efficiency * price;
        String str1 = String.format("To drive 100 miles, it will cost $%.2f.", cost);
        System.out.println(str1);

        currently = gas*efficiency;
        String str2 = String.format("The car can currently driva a maximum of %.6f", currently);
        System.out.println(str2);
        

    }
}
