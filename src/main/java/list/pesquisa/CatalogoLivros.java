package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervalo.add(l);
                }
            }
        } return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        } return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Aprendendo Java","JavanIII",2023);
        catalogoLivros.adicionarLivro("Aprendendo Java","JavanIII",2023);
        catalogoLivros.adicionarLivro("Aprendendo Python","Pythonius",2020);
        catalogoLivros.adicionarLivro("Aprendendo Javascript","J.S",2018);
        catalogoLivros.adicionarLivro("Aprendendo C#","C.S Sharpington",2015);

        System.out.println(catalogoLivros.pesquisarPorAutor("JavanIII"));
        System.out.println("---------------------");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2020,2023));
        System.out.println("---------------------");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Aprendendo Java"));



    }// End Main Class




} //END CatalogoLivros class

