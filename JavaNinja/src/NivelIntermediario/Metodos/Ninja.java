package NivelIntermediario.Metodos;

public class Ninja {

    String nome;
    String aldeia;
    int idade;


    // Criar um método público personalizado
    // O método void = não retorna valor nenhum

    public void SharinganAtivado(){
        System.out.println("O sharingan Ativou!");
    }

    /*
    *   Método String vai ter que retornar uma String
    *
     */

    public String EuSouUmNinja(){
        return "Oi, Eu sou um ninja!";
    }

    /*
    *   Método Int vai ter que retornar um int
    *
     */

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokages){
        return idadeMinimaParaSerHokages - idade;
    }

}
