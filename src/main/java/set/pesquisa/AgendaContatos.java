package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Tarcisio", 12345678);
        agendaContatos.adicionarContato("Tarcisio Silva", 12345679);
        agendaContatos.adicionarContato("Deivid", 12345670);
        agendaContatos.adicionarContato("Zé", 12345671);
        agendaContatos.adicionarContato("Igor", 12345672);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Tarcisio"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Zé", 11111111));
        agendaContatos.exibirContatos();
    }
}
