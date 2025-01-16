package NivelBasico.Array2D.java;

public class Array2D {
    public static void main(String[] args) {

        //String simples
        /*
        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";
        for (int i = 0; i < ninjas.length; i++){
            System.out.println(ninjas[i]);
        }*/

        // String 2D
        // [linha][coluna]

        String [][] ninjasEAldeias = new String [3][3];

        ninjasEAldeias [0][0] = "Konoha";
        ninjasEAldeias [0][1] = "Naruto Uzumaki";
        ninjasEAldeias [0][2] = "Sasuke Uchiha";

        ninjasEAldeias [1][0] = "Navoa";
        ninjasEAldeias [1][1] = "Zabuza";
        ninjasEAldeias [1][2] = "Haku";

        ninjasEAldeias [2][0] = "Deserto";
        ninjasEAldeias [2][1] = "Gaara";
        ninjasEAldeias [2][2] = "Temari";

        //System.out.println(ninjasEAldeias[0][1]);

        /*
        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][1]);
        }*/

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]);
            for (int j = 1; j < ninjasEAldeias[i].length; j++) {
                System.out.println("Ninja: " + ninjasEAldeias[i][j]);
            }
        }
    }
        }
