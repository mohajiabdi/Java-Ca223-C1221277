public class GradesUsingGba {
    public static void main(String[] args) {
        int score = 85;
        double gpa = convertToGBA(score);
        System.out.println("Score: " + score);
        System.out.println("GPA: " + gpa);

    }


    public static double convertToGBA(int score) {
        double gpa;

        if (score >= 90) {
            gpa = 4.0;
        } else if (score >= 80) {
            gpa = 3.0;
        } else if (score >= 70) {
            gpa = 2.0;
        } else if (score >= 60) {
            gpa = 1.0;
        } else {
            gpa = 0.0;
        }

        return gpa;
    }
}
