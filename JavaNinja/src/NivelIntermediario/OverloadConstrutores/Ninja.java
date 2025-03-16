package NivelIntermediario.OverloadConstrutores;

    public abstract class Ninja implements EstrategiaDeBatalha {

        //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
        //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage


        String nome;
        String aldeia;
        int idade;
        int numeroDeMissoesConcluidas;
        NivelNinja rank;




        public Ninja() {
        }


        // Método existente: Primeiro método
        public Ninja(String nome, String aldeia, int idade) {
            this.nome = nome;
            this.aldeia = aldeia;
            this.idade = idade;

        }

        // TODO: Sobrecarga do construtor chamando os novos atributos
        // Sobrecarga de metodos você não precisa redeclarar o construtor, só os novos atributos

        public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
            this(nome, aldeia, idade);
            this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
            this.rank = rank;
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

