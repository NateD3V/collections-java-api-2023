package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributo
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome,Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        } return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila",99887766);
        agendaContatos.adicionarContato("Camila",99887722);
        agendaContatos.adicionarContato("Ronaldo",99772306);
        agendaContatos.adicionarContato("Bonitão das Tapiocas",88669845);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Ronaldo");
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));





    }//End Class Main



}//End class AgendaContatos
