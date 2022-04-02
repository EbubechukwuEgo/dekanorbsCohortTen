package arrays;

public class XandO {
    public static void main(String[] args) {
        String[][] xandO = new String[3][3];

        xandO[0][0] = "X ";
        xandO[0][1] = " O ";
        xandO[0][2] = " X";

        xandO[1][0] = "X ";
        xandO[1][1] = " X ";
        xandO[1][2] = " X";

        xandO[2][0] = "O ";
        xandO[2][1] = " X ";
        xandO[2][2] = " O";

        System.out.println(xandO[0][0] + xandO[0][1] + xandO[0][2]);
        System.out.println(xandO[1][0] + xandO[1][1] + xandO[1][2]);
        System.out.println(xandO[2][0] + xandO[2][1] + xandO[2][2]);
    }
}
