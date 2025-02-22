import java.util.List;

public abstract class MetodoOrdenacao {
    public abstract List<Tarefa> ordenar(List<Tarefa> tarefas);

    public String listarTarefas(TarefaRepository repository) {
        String formatacao = "\n";
        List<Tarefa> tarefasOrdenadas = ordenar(repository.getTarefas());
        for (Tarefa tarefa : tarefasOrdenadas) {
            formatacao +=   "--------------------------------------" + 
                            "\nTarefa: " + tarefa.getNome() + 
                            "\nData de Criação: " + tarefa.getDataCriacao() + 
                            "\nPrioridade: " + tarefa.getPrioridade() + "\n" +
                            "--------------------------------------"
                        ;
        }

        return formatacao;
    }
}
