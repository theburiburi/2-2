import java.util.Scanner;

public class InvoicePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String Name, Street, City, State, Zipcode;
        System.out.println("Please enter an address (empty line to terminate)");
        System.out.print("Name: ");
        Name = in.nextLine();
        if (Name.equals("")) return;

        System.out.print("Street: ");
        Street = in.nextLine();
        if (Street.equals("")) return;

        System.out.print("City: ");
        City = in.nextLine();
        if (City.equals("")) return;

        System.out.print("State: ");
        State = in.nextLine();
        if (State.equals("")) return;

        System.out.print("Zipcode: ");
        Zipcode = in.nextLine();
        if (Zipcode.equals("")) return;

        Address uijaesAddress = new Address(Name, Street, City, State, Zipcode);
        Invoice uijaesInvoice = new Invoice(uijaesAddress);

        while(true)
        {
            System.out.println("Product description (empty line to terminate)");
            String Production = in.nextLine();
            if (Production.equals("")) break;

            System.out.print("Price: ");
            Double Price = in.nextDouble();

            System.out.println("Quantity: ");
            int Quantity = in.nextInt();
            in.nextLine();

            uijaesInvoice.add(new Product(Production, Price), Quantity);
        }
        
        System.out.println(uijaesInvoice.format());
    }
}
