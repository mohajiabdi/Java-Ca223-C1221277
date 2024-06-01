package Chapter6AllExamplesMethods;

public class ScopeLocal {
    public static void main(String[] args) {
        correctMethod();
    }

    public static void correctMethod() {
        int x = 1;
        int y = 1;
        // i is declared
        for (int i = 1; i < 10; i++) {
            x += i;
        }
        // i is declared again
        for (int i = 1; i < 10; i++) {
            y += i;
        }
    }

}
