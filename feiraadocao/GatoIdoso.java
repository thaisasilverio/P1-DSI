package feiraadocao;

public class GatoIdoso extends Gato{
    private String medicacao;

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

   
    @Override
    public double calculaCustoVacinacao() {
        return 0;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Medicação: " + this.getMedicacao());
    }
}
