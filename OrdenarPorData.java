import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarPorData extends MetodoOrdenacao {

    public List<Tarefa> ordenar(List<Tarefa> tarefas) {

        List<Tarefa> tarefasOrdenadas = new ArrayList<>();
        tarefasOrdenadas.addAll(tarefas);

        Collections.sort(tarefasOrdenadas, new Comparator<Tarefa>() {
            public int compare(Tarefa t1, Tarefa t2) {
                if (t1.getDataCriacao() == null || t2.getDataCriacao() == null) return 0;
                return t1.getDataCriacao().compareTo(t2.getDataCriacao());
            }
        });

        return tarefasOrdenadas;
    }
}
