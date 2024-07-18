import java.text.DecimalFormat;
import java.text.NumberFormat;


public class doubleEverday {
    public static void main(String[] args) {
        long start = 100;
        int days = 45;
        long total = 0;
        // Make them readerable like 999,999,999
        DecimalFormat decimalFormat = new DecimalFormat("#,##0");

        // make them into English words
        NumberFormat wordFormat = NumberFormat.getInstance();

        for(int i = 0; i < days; i++){
            total = start;
            start *= 2;

            String formattedTotal = decimalFormat.format(total);

            String wordTotal = wordFormat.format(total);

            System.out.println("Day " + (i+1) + ": " + formattedTotal+ " and In English: " + wordTotal);
        }
    }
}
