import java.awt.*;

public class FunctionOverLoad {
    public static void main(String[] args) {
        System.out.println(add(2.0,5));
    }
    public static int add(int a, int b){
        return a-b;
    }
    public static double add(double a, double b){
        return a+b;
    }
}
