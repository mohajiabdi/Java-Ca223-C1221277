import java.util.Scanner;

public class MeetingDay {
    public static void main(String[] args) {
        // meeting Day of the Week

        int dayOfWeek, meetDay;
        final int WEEKDAYS = 7;

        // Create object from Scanner Class

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Day Of the Week: ");

        dayOfWeek = input.nextInt();

        // calculate meeting day

        meetDay = (dayOfWeek + 10)%WEEKDAYS;

        System.out.printf("Meeting Day of the week is: "+ meetDay);

    }
}
