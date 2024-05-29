package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {
            if (palavrasSet.contains(palavra)) {
                System.out.println("A palavra " + palavra + " está no hash.");
            } else {
                System.out.println("Palavra não encontrada.");
            }
        } else {
            System.out.println("Hash vazio.");
        }
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("Manga");
        conjuntoPalavrasUnicas.adicionarPalavra("Banana");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Banana");

        conjuntoPalavrasUnicas.removerPalavra("Banana");
        conjuntoPalavrasUnicas.verificarPalavra("Banana");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
