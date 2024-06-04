package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributos

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().equals(dataAtual)|| entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo " + entry.getValue() + " acontecera na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JUNE, 24), "São joão", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JUNE, 30), "São Pedro", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 24), "São João", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 6), "Nada", "Nada");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }
}
