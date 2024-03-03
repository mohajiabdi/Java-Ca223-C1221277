import java.util.Scanner;

public class BuyingCar {
    public static void main(String[] args) {

        //Calculating The car price and Tax value

        final double TAX = 65;
        double carPrice;
        String carName, carModel;

        // Create Object from Scanner Calss
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Car Price: ");
        carPrice = input.nextDouble();
        System.out.printf("Enter Car NAme: ");
        carName = input.next();
        System.out.printf("Enter Car Model: ");
        carModel = input.next();

        // Calculating Total And Tax
        double total = carPrice + TAX;


        System.out.printf("The Car of "+carName+" With the Model: "+ carModel+" And its Price after tax is: "+total);




    }
}
