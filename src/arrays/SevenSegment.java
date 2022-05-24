package arrays;

public class SevenSegment {

    String[][] sevenSegmentArmy = new String[5][4];

    public void setA(){
        for (int i = 0; i <= 0; i++){
            for (int j = 0; j <= 3; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }
    public void setB(){
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 3; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }
    public void setC(){
        for (int i = 2; i <= 4; i++){
            for (int j = 3; j <= 3; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }
    public void setD(){
        for (int i = 4; i <= 4; i++){
            for (int j = 0; j <= 3; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }
    public void setE(){
        for (int i = 2; i <= 4; i++){
            for (int j = 0; j <= 0; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }
    public void setF(){
        for (int i = 0; i <= 2; i++){
            for (int j = 0; j <= 0; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }
    public void setG(){
        for (int i = 2; i <= 2; i++){
            for (int j = 0; j <= 3; j++){
                sevenSegmentArmy[i][j] = "* ";
            }
        }
    }

    public void setScreen() {
        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 3; j++){
                sevenSegmentArmy[i][j] = " ";
            }
        }
    }

    public  void settingDisplay(String entrada){
        setScreen();
        if (entrada.charAt(7) == '1'){
            if (entrada.charAt(0) == '1') setA();
            if (entrada.charAt(1) == '1') setB();
            if (entrada.charAt(2) == '1') setC();
            if (entrada.charAt(3) == '1') setD();
            if (entrada.charAt(4) == '1') setE();
            if (entrada.charAt(5) == '1') setF();
            if (entrada.charAt(6) == '1') setG();
        }
    }
    public void display() {
        for (int i = 0; i <= 4; i++){
            for (int j = 0; j <= 3; j++){
                System.out.print(sevenSegmentArmy[i][j] + " ");
            }
            System.out.println();
        }
    }
}
