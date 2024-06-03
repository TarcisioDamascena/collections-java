package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Dicionario Vazio.");
        }
    }

    public void exibirPalavras() {
        if (!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        } else {
            System.out.println("Dicionario vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisada = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
            return palavraPesquisada;
        } else {
            return "Dicionario vazio.";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        String definicaoPalavra;

        dicionario.adicionarPalavra("Escopo", "Espaço ou oportunidade para um movimento");
        dicionario.adicionarPalavra("Senescência", "Processo natural de envelhecimento.");
        dicionario.adicionarPalavra("Asseidade", "Característica de um ser que existe por si mesmo.");
        dicionario.adicionarPalavra("Diletante", "Quem realiza algo por gosto e não por obrigatoriedade.");

        dicionario.removerPalavra("Senescência");

        dicionario.exibirPalavras();
        definicaoPalavra = dicionario.pesquisarPorPalavra("Escopo");
        System.out.println("A definição de Escopo é: " + definicaoPalavra);

        definicaoPalavra = dicionario.pesquisarPorPalavra("Senescência");
        System.out.println("A definição de Senescência é: " + definicaoPalavra);

    }
}
