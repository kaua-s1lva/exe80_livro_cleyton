import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarPorPrioridade extends MetodoOrdenacao {
    public List<Tarefa> ordenar(List<Tarefa> tarefas) {

        List<Tarefa> tarefasOrdenadas = new ArrayList<>();
        tarefasOrdenadas.addAll(tarefas);

        Collections.sort(tarefasOrdenadas, new Comparator<Tarefa>() {
            public int compare(Tarefa t1, Tarefa t2) {
                if (t1.getPrioridade() > t2.getPrioridade()) {
                    return 1;
                } else if (t1.getPrioridade() < t2.getPrioridade()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        return tarefasOrdenadas;
    }
}
