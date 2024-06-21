public class Produto{
    private String nome;
    private String descricao;
    private double valor;
    private String disponivel;

    public Produto(String nome, String descricao, double valor, String disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "(Nome: " + nome + "\nDescrição: " + descricao + "\nValor: " + valor + "\nDisponível: " + disponivel + ")";
    }
}
