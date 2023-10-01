package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaitems;
    public CarrinhoDeCompras(){
        this.listaitems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
       listaitems.add(new Item(nome,preco,quantidade));

    }

    public void removerItem(String nome){
        List<Item> removerItemLista = new ArrayList<>();
        for (Item i: listaitems) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                removerItemLista.add(i);
            }
        }
        listaitems.removeAll(removerItemLista);

    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Item i: listaitems) {
            double valorItem = i.getQuantidade() * i.getPreco();
            valorTotal += valorItem;
        } return valorTotal;
    }

    public void exibirItens(){
        if (!listaitems.isEmpty()){
            System.out.println(this.listaitems);
        } else {
            System.out.println("A lista está vazia");
        }
    }



    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaitems=" + listaitems +
                '}';
    }

    public static void main(String[] args) {

        //Cria nova instância do CarrinhoDeCompras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Adiciona os itens à lista
        carrinhoDeCompras.adicionarItem("caderno",10d,5);
        carrinhoDeCompras.adicionarItem("caderno",2d,5);
        carrinhoDeCompras.adicionarItem("caneta",2d,10);
        carrinhoDeCompras.adicionarItem("borracha",1d,15);

        //Exibir os itens
        carrinhoDeCompras.exibirItens();

        //Remover o item (Se houver itens com o mesmo nome, remove-os também)
        carrinhoDeCompras.removerItem("caderno");

        //Exibir os itens, atualizado
        carrinhoDeCompras.exibirItens();

        //Calcular o valor total dos itens
        System.out.println("O valor total é: R$ "+ carrinhoDeCompras.calcularValorTotal());

        //Menu alternativo para exibir os itens
        for (Item i: carrinhoDeCompras.listaitems){
            System.out.println("Item: "+ i.getNome());
            System.out.println("Preço: "+ i.getPreco());
            System.out.println("Quantidade: "+ i.getQuantidade());
            System.out.println("---------------------");
        }




    }

}

