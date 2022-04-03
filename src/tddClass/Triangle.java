package tddClass;

public class Triangle {

    public static void main(String[] args){
        for (int row = 10; row > 0; row--){
            for (int column = 0; column <= row; column++){
                System.out.print(column +" ");
            }
            System.out.println();
        }
        for (int tio = 0; tio < 10; tio++){
            for (int tia = 0; tia <= tio; tia++){
                System.out.print(tia +" ");
            }
            System.out.println();
        }
        for (int gato = 10; gato > 0; gato--){
            for (int gata = 10; gata >= gato; gata--){
                System.out.print(gata +" ");
            }
            System.out.println();
        }
        for (int appel = 10; appel > 0; appel--){
            for (int sinaasappel = 0; sinaasappel <= appel; sinaasappel++){
                System.out.print(sinaasappel +" ");
            }
            System.out.println();
        }
    }
}
