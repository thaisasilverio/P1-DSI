package feiraadocao;

public class GatoEspecial extends Gato{
    private String necessidadeEspecial;

    public String getNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(String necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    
    @Override
    public double calculaCustoVacinacao() {
        return 0;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Necessidade especial: " + this.getNecessidadeEspecial());
    }
}