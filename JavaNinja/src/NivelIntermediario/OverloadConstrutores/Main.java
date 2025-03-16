package NivelIntermediario.OverloadConstrutores;


public class Main {
    public static void main(String[] args) {


        // Obj ninja não pode ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 12, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        // Obj Uchiha2
        Uchiha itachi = new Uchiha("Itachi Uchira", "Aldeia da Folha", 27 );
        itachi.habilidadeEspecial();

        // Obj Uchiha3
        Uchiha madara = new Uchiha("Madara Uchiha","Aldeia da folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

    }
}
