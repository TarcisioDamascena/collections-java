package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //Atributos
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()){
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        } else {
            throw new RuntimeException("Vazio.");
        }
    }


    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(3L, "Budweiser", 6.70D, 6);
        produtos.adicionarProduto(1L, "Brhama", 3.50D, 12);
        produtos.adicionarProduto(4L, "Stella", 6.90D, 6);
        produtos.adicionarProduto(2L, "Skol", 4.70D, 12);
        produtos.adicionarProduto(4L, "Original", 5.30D, 12);

        System.out.println(produtos.produtoSet);
        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
