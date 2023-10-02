package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //Atributo
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo,String nome,double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    };

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new comparatorPorPreço());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    };


    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L,"smartphone",1000d,5);
        cadastroProduto.adicionarProduto(2L,"notebook",2500d,2);
        cadastroProduto.adicionarProduto(3L,"mouse gamer",150d,30);
        cadastroProduto.adicionarProduto(4L,"cadeira gamer",1200d,3);

        System.out.println(cadastroProduto.produtoSet);


        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());

    }

}//End Class Cadastro





