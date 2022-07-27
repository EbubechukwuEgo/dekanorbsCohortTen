package streamsAndLambdas;

public class NoClueWhatImDoing {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i<=20; i++){
            if (i % 2 == 1){
                total += i * 3;
            }
        }
        System.out.println(total);

    }
}
