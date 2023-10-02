package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c: convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }convidadoSet.remove(convidadoParaRemover);
        System.out.println("Convidado do convite número:  "+ codigoConvite + " removido");
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidados na festa!");

        conjuntoConvidados.adicionarConvidado("Ozzy O.",1234);
        conjuntoConvidados.adicionarConvidado("Axl R.",1235);
        conjuntoConvidados.adicionarConvidado("Vincent D.",1236);
        conjuntoConvidados.adicionarConvidado("Bruce D.",1237);
        conjuntoConvidados.adicionarConvidado("Penetra de Festa.",1237);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidados na festa!");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigo(1236);

        conjuntoConvidados.exibirConvidados();


    }//END Class MAIN







}//END class ConjuntoConvidados
