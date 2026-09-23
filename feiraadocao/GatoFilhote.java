package feiraadocao;

public class GatoFilhote extends Gato{
    private String situacaoVacinal;

    public String getSituacaoVacinal() {
        return situacaoVacinal;
    }

    public void setSituacaoVacinal(String situacaoVacinal) {
        this.situacaoVacinal = situacaoVacinal;
    }

    
    @Override
    public double calculaCustoVacinacao() {
        return super.calculaCustoVacinacao() * 0.5;
    }

    @Override
    public void mostraDados() {
        super.mostraDados();
        System.out.println("Situação vacinal: " + this.getSituacaoVacinal());
    }
}