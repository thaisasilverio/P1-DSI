package feiraadocao;

public class TestaFeiraAdocao {

    public static void main(String[] args) {

        GatoFilhote g1 = new GatoFilhote();
        // Classe Gato (mãe)
        g1.setNome("Robertinha");
        g1.setIdade(1);
        g1.setRaca("SRD");
        // Classe filha (GatoFilhote)
        g1.setSituacaoVacinal("Completa");

        GatoIdoso g2 = new GatoIdoso();
        // Classe Gato (mãe)
        g2.setNome("Theodoro");
        g2.setIdade(12);
        g2.setRaca("Persa");
        // Classe filha (GatoIdoso)
        g2.setMedicacao("Anti inflamatório para artrite");

        GatoEspecial g3 = new GatoEspecial();
        // Classe Gato (mãe)
        g3.setNome("Lily");
        g3.setIdade(4);
        g3.setRaca("Siamês");
        // Classe filha (GatoEspecial)
        g3.setNecessidadeEspecial("Cegueira");

        System.out.println("=================================");
        System.out.println("FILHOTE:");
        g1.mostraDados();

        System.out.println("=================================");
        System.out.println("IDOSO:");
        g2.mostraDados();

        System.out.println("=================================");
        System.out.println("ESPECIAL:");
        g3.mostraDados();
      
        System.out.println("=================================");
        System.out.println("Custo do filhote com desconto de R$10: " + g1.calculaCustoVacinacao(10));
    }
}