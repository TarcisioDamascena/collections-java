package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //Atributo
    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item>itemsParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemsParaRemover.add(i);
                }
            }
            itemList.removeAll(itemsParaRemover);
        }else {
            System.out.println("A lista esta vazia!");
        }

    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Item i : itemList){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.removerItem("Leite");

        carrinhoCompras.adicionarItem("Leite",5.50,5);
        carrinhoCompras.adicionarItem("Macarrão",4.75,2);
        carrinhoCompras.adicionarItem("Chocolate",6.53,1);

        System.out.println("Itens no carrinho: \n" + carrinhoCompras.itemList);
        System.out.println("Valor total: " + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.removerItem("Leite");

        System.out.println("Itens no carrinho: \n" + carrinhoCompras.itemList);
        System.out.println("Valor total: " + carrinhoCompras.calcularValorTotal());

    }
}
