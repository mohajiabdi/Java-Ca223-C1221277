import java.util.Scanner;

public class gamblingRatio {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Enter How Many participants are there: ");
        int participant =input.nextInt();
        double total =0.0;
        double[] betAmount1 = new double[participant];
        double[] betAmount2 = new double[participant];
        double[] winning = new double[participant];


        // Loop through to get participants team 1 bets and record the total
        for(int i=0; i<participant; i++){
                System.out.print("Enter the bet amount of Team_One Participant " + (i+1) + " (-1 to exit): ");
                betAmount1[i] = input.nextDouble();
                if(betAmount1[i] == -1) break;
                total += betAmount1[i];
        }
        System.out.println("");
        // Loop through to get participants team 2 bets and record the total
        for(int i=0; i<participant; i++){
            System.out.print("Enter the bet amount of Team_Two Participant " + (i+1) + " (-1 to exit): ");
            betAmount2[i] = input.nextDouble();
            if(betAmount2[i] == -1) break;
            total += betAmount2[i];
        }

        System.out.print("\nWhich team is The Winner: ");
        int teamW = input.nextInt();
        System.out.println("The Wininning team is Team"+ teamW);

        if(teamW == 1){
            for(int i=0; i<participant; i++){
                winning[i] = betAmount1[i] * (total /100);
            }
        }else if(teamW == 2){
            for(int i=0; i<participant; i++){
                winning[i] = betAmount2[i] * (total /100);
            }

        }else{
            System.out.println("Invalid team number");
        }




        for(int i=0; i<participant; i++){
            System.out.println("Participant " + (i+1) + " winning: " + winning[i]);


        }
    }
}
