package NivelIntermediario.OverloadConstrutores;

    public abstract class Ninja implements EstrategiaDeBatalha {

        String nome;
        String aldeia;
        int idade;

        public Ninja() {
        }

        public Ninja(String nome, String aldeia, int idade) {
            this.nome = nome;
            this.aldeia = aldeia;
            this.idade = idade;

        }

        //Metodo geral! Todos os ninjas vao ter
        public void habilidadeEspecial(){
            System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
        }
        //Sobreescrevendo o método da interface
        @Override
        public void estrategiaDeBatalhaNinja(){
            System.out.println("Meu nome é: " + nome + " Essa é minha estratégia de combate");
        }
    }
}
