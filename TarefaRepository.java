import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaRepository {
    private List<Tarefa> tarefas;

    public TarefaRepository() {
        tarefas = new ArrayList<>();
    }

    public void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public List<Tarefa> getTarefas() {
        return Collections.unmodifiableList(tarefas);
    }
}
