package feiraadocao;

public  class Gato {
    private String nome;
    private int idade;
    private String raca;

    public Gato() {
        System.out.println("Um novo gato chegou para a feira de adoção!");
    }

    public Gato(String nome, int idade, String raca) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setRaca(raca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double calculaCustoVacinacao() {
        return 80;
    }

    public double calculaCustoVacinacao(double desconto) {
        return this.calculaCustoVacinacao() - desconto;
    }

    public void mostraDados() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Raça: " + this.getRaca());
        System.out.println("Custo de vacinação/castração: R$ " + this.calculaCustoVacinacao());
    }
}
