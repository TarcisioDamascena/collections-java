package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int valorTotal = 0;
        for (Integer i : numeros) {
            valorTotal += i;
        }
        return valorTotal;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer i : numeros){
                if (i >= maiorNumero){
                    maiorNumero = i;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer i : numeros){
                if (i <= menorNumero){
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(10);

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
}
