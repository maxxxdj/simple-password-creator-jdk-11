import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    final static String ALPHABET_UK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    public static void main(String[] args) {
        System.out.println(generatePassword(10));
    }
    public static String generatePassword(final int passLength){
        return IntStream.range(0, passLength)
                 .mapToObj(el -> String.valueOf(ALPHABET_UK.charAt(new Random().nextInt(ALPHABET_UK.length()))))
                 .collect(Collectors.joining(""));
    }
}