package AssignmentChapter7All;

import java.util.Random;

public class RandomCharacter {
    private static final Random random = new Random();

    public static char getRandomLowerCaseLetter() {
        return (char) (random.nextInt(26) + 'a');
    }
}