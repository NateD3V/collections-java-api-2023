package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefa(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    //Main
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefa());

        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.adicionarTarefa("Comprar ração");
        listaTarefas.adicionarTarefa("Lavar o carro");
        listaTarefas.removerTarefa("Lavar o carro");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefa());
        listaTarefas.obterDescricoesTarefas();

    }

}//END CLASS ListaTarefas
