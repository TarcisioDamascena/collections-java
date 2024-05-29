package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributos
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Tarcisio", 1234);
        conjuntoConvidados.adicionarConvidado("Igor", 1231);
        conjuntoConvidados.adicionarConvidado("Savio", 1231);
        conjuntoConvidados.adicionarConvidado("Jozé", 1334);

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1141);
        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }

}
