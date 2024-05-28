package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //Atributos
    private List<Integer> numerosList;

    //Construtor
    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(numerosList);
        if (!numerosList.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(3);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);

        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}
