import java.text.DecimalFormat;
import java.util.Scanner;

public class earningMore__ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hours;
        double minutes;
        double days;
        double months;
        double years;
        final int RATE_INCOME = 1500;
        double total;
        String formattedTotal;

        // Make them readerable like 999,999,999
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");



        System.out.print("You Make " + RATE_INCOME +" Dollars Every Minute"+"\nChoose: \n\t\tType ( mi ) for Minutes\n" +
                "\t\tType ( h ) for Hours\n\t\tType ( d ) for Days\n\t\tType ( mo ) for Months\n\t\tType ( y ) for Years: \t ");
        String choice = input.next();

        switch(choice){
            case "h":
                System.out.print("Enter Hours: ");
                hours = input.nextDouble();
                minutes = hours * 60;
                days = hours / 24;
                months = days / 30;
                total = minutes * RATE_INCOME;
                formattedTotal = decimalFormat.format(total);
                System.out.printf("%.2f of Minutes\nWhich is Equal to %.2f Hours \n" +
                        "Which is Equal to %.2f Days\nWhich is Equal to %.2f Months\n" +
                        "The Income is %s Dollars",minutes,hours,days,months,formattedTotal);
                break;
            case "mi":
                System.out.print("Enter Minutes: ");
                minutes = input.nextDouble();
                hours = minutes / 60;
                days = hours / 24;
                total = minutes * RATE_INCOME;
                formattedTotal = decimalFormat.format(total);
                System.out.printf("%.2f of Minutes\nWhich is Equal to %.2f Hours \n" +
                        "Which is Equal to %.2f Days\n" +
                        "The Income is %s Dollars",minutes,hours,days,formattedTotal);
                break;
            case "mo":
                System.out.print("Enter Months: ");
                months = input.nextDouble();
                days = months * 30;
                hours = days * 24;
                minutes = hours * 60;
                years = months / 12;
                total = minutes * RATE_INCOME;
                formattedTotal = decimalFormat.format(total);
                System.out.printf("%.2f of Minutes\nWhich is Equal to %.2f Hours \n" +
                        "Which is Equal to %.2f Days\nWhich is Equal to %.2f Months\n" +
                        "Wich is Equal to %.2f Years \n" +
                        "The Income is %s Dollars",minutes,hours,days,months,years,formattedTotal);
                break;
            case "d":
                System.out.print("Enter Days: ");
                days = input.nextDouble();
                hours = days *24;
                months = days /30;
                minutes = hours * 60;
                years = months / 12;
                total = minutes * RATE_INCOME;
                formattedTotal = decimalFormat.format(total);
                System.out.printf("%.2f of Minutes\nWhich is Equal to %.2f Hours \n" +
                        "Which is Equal to %.2f Days\nWhich is Equal to %.2f Months\n" +
                        "Wich is Equal to %.2f Years \n" +
                        "The Income is %s Dollars",minutes,hours,days,months,years,formattedTotal);
                break;
            case "y":
                System.out.print("Enter Years: ");
                years = input.nextDouble();
                months = years * 12;
                days = months * 30;
                hours = days * 24;
                minutes = hours * 60;
                total = minutes * RATE_INCOME;
                formattedTotal = decimalFormat.format(total);
                System.out.printf("%.2f of Minutes\nWhich is Equal to %.2f Hours \n" +
                        "Which is Equal to %.2f Days\nWhich is Equal to %.2f Months\n" +
                        "Wich is Equal to %.2f Years \n" +
                        "The Income is %s Dollars",minutes,hours,days,months,years,formattedTotal);
                    break;
            default:
                System.out.print("You Entered Wrong!... ");
        }



    }
}
