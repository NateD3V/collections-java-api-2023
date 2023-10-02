package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;
public class AgendaContatos {
    //atributo
    private Set<Contato> contatoset;

    public AgendaContatos(){
        this.contatoset = new HashSet<>();
    }

    public void adicionarContato(String nome,int numero){
        contatoset.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoset);
    }


    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoset){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoset){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }return contatoAtualizado;
    }

    //Class MAIN
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila",99887766);
        agendaContatos.adicionarContato("Camila",99887722);
        agendaContatos.adicionarContato("Ronaldo",99772306);
        agendaContatos.adicionarContato("Bonitão das Tapiocas",88669845);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Ronaldo"));

        System.out.println("Contato atualizado: "+ agendaContatos.atualizarNumeroContato("Ronaldo",85965523));

        agendaContatos.exibirContato();

    }//END Class Main


}//END class AgendaContatos
