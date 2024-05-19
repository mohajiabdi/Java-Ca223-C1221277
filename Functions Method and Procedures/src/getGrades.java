import java.util.*;
import java.lang.System;


public class getGrades {
    public static void main(String[] args) {
        double grade = 80;
        // System.out.print(getGrade(grade));
        System.out.println(getGrade(95));

    }


    // User Defined Functions and More Down Below...

    public static char getGrade(double grade) {
        if (grade >= 90)
            return 'A';
        else if (grade >= 80)
            return 'B';
        else if (grade >= 70)
            return 'C';
        else if (grade >= 60)
            return 'D';
        else
            return 'F';
    }


}
