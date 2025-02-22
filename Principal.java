import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        TarefaRepository repository = new TarefaRepository();
        repository.adicionar(new Tarefa("catar coquim", LocalDate.of(2024, 12, 5), 5));
        repository.adicionar(new Tarefa("consertar teclado", LocalDate.of(2023, 12, 5), 4));
        repository.adicionar(new Tarefa("cagar", LocalDate.of(2024, 11, 5), 7));
        repository.adicionar(new Tarefa("beber agua", LocalDate.of(2024, 12, 4), 10));
        repository.adicionar(new Tarefa("tomar banho", LocalDate.of(2022, 11, 5), 5));

        System.out.println(new OrdenarPorData().listarTarefas(repository));
        System.out.println(new OrdenarPorPrioridade().listarTarefas(repository));
    }
}
