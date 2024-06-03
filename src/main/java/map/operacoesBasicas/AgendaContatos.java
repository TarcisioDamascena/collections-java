package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap =new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        } else {
            throw new RuntimeException("Conjunto vazio.");
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Tarcisio", 11111111);
        agendaContatos.adicionarContato("Igor", 22222222);
        agendaContatos.adicionarContato("Danilo", 33333333);
        agendaContatos.adicionarContato("Deivid", 44444444);
        agendaContatos.adicionarContato("Savio", 55555555);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Tarcisio");
        agendaContatos.exibirContatos();

        System.out.println("O numero de Deivid é " + agendaContatos.pesquisarPorNome("Deivid"));

    }
}
