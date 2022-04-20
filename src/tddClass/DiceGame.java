package tddClass;

import java.security.SecureRandom;

public class DiceGame {

    public int gameOver() {
        SecureRandom random = new SecureRandom();
        int dice1 = random.nextInt();

        return dice1;
    }

    public int gameContinue() {
        int point = 0;
        for(int j = 2; j <= 12; j++){
            point = j;
            if (point == 4){
                System.out.println("You have earned a point");
            }
        }
        return point;
    }
}
