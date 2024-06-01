package Questions;

import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args) {


        //Calling LoopTotal Function
        loopTotal();


    }


    public static void loopTotal(){
        int total = 0;
        for(int i = 1; i <= 10; i++){
            total +=i;
        }
        System.out.println("\n\nLoop Total of 1 to 10 is: "+total);
    }



}
