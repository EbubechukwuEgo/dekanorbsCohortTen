package arraylists;

import java.util.ArrayList;

public class AnArrayList {

    public static void main(String[] args) {
        ArrayList<String> lenguas = new ArrayList<>();

        lenguas.add("Espanol");
        lenguas.add("Aleman");
        lenguas.add("Frances");
        lenguas.add("Japones");
        lenguas.add(4, "Ingles");

        lenguas.set(2,"Irlandes");

        System.out.println(lenguas.subList(1,4));

//        String str = lenguas.get(4);
//        System.out.println("El idioma que se habla en inglaterra es "+ str);



//        lenguas.remove("Aleman");

//        if (lenguas.isEmpty()){
//            System.out.println("ArrayList is empty");
//        } else{
//            System.out.println("ArrayList is not empty");
//        }
//        lenguas.clear();


        System.out.println(lenguas);
    }
}
