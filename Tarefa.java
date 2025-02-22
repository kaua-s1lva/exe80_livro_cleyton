import java.time.LocalDate;

public class Tarefa {
    private String nome;
    private LocalDate dataCriacao;
    private int prioridade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    public Tarefa(String nome, LocalDate dataCriacao, int prioridade) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.prioridade = prioridade;
    }
    
}