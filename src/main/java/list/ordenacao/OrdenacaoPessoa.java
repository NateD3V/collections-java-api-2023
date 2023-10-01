package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }


    public static void main(String[] args) {
        //Instanciação
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        //Método adicionarPessoas
        ordenacaoPessoa.adicionarPessoa("José",20,1.75);
        ordenacaoPessoa.adicionarPessoa("Joâo",28,1.72);
        ordenacaoPessoa.adicionarPessoa("Isabela",19,1.65);
        ordenacaoPessoa.adicionarPessoa("Baianinho",45,1.70);

        //Métodos de ordenação
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());




    }//END Public class MAIN

}//END public class OrdenacaoPessoa
