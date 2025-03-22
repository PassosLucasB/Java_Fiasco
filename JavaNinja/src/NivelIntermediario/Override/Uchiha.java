package NivelIntermediario.Override;

public class Uchiha extends Ninja {

        public Uchiha(){
            super();
        }

        public Uchiha(String nome, String aldeia, int idade) {
            super(nome, aldeia, idade);
        }

        public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
            super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        }

        //Sobreescrever o método da classe Ninja
        @Override
        public void habilidadeEspecial(){
            System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. Eu já completei: "
                    + numeroDeMissoesConcluidas + " missões.");
        }

        // Inteligência de combate - Método padrão
        @Override
        public void inteligenciaDeCombate(){
            System.out.println("Meu nome é: " + nome + " Essa é minha INTELIGÊNCIA de combate");
        }


        // Inteligência de combate - Sobrecarga de método
        @Override
        public void inteligenciaDeCombate(int qi){

            if (qi > 150){
               System.out.println("Seu QI é: " + qi + " e você é um gênio");
           } else if (qi >= 130) {
               System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
           }else {
               System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
            }
       }
}
