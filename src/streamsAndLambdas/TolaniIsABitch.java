package streamsAndLambdas;

import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TolaniIsABitch {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 10)
                .reduce((acc, el) -> acc + el)
                .getAsInt();

        String input = new Scanner(System.in).nextLine();

        input = input.toLowerCase();
        String[] elements = input.split(" ");

        List<String> stringList = Stream.of(elements)
                .sorted()
                .distinct().toList();

        System.out.println(stringList);
    }
}
