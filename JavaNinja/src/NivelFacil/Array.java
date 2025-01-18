package NivelFacil;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referência!
        // String inicializa com null
      String[] ninja = new String [6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";
        /*
        System.out.println(ninja[5]);
        */
        // Redeclarar o ARRAY

        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikase";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        // For paa fazer um LOOP no Array

      for (int i = 0; i < 7; i++) {
        System.out.println(ninja[i]);
      }


        // Array idade
        // int inicializa com 0
        int [] idade = new int[2];
        System.out.println(idade[1]);

        //  Array boolean
        // boolean inicializa com false
        boolean [] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Array doubles
        // double inicializa com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);



        String nomeDoNinja1 = "Gaara do deserto";
        String nomeDoNinja2 = "Rock Lee";



     /*
        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
      */
    }
}
