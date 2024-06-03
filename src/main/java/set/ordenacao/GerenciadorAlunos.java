package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    //Atributos
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAlunoPorMatricula(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()){
            for (Aluno a: alunoSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        }else {
            throw new RuntimeException("Não há alunos cadastrados.");
        }

        if (alunoParaRemover == null){
            System.out.println("Matricula não encontrada.");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosOrdemAlfabetica = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()){
            System.out.println(alunosOrdemAlfabetica);
        } else {
            System.out.println("Não há alunos cadastrados.");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunoSet.isEmpty()){
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        }
        else {
            System.out.println("Não há alunos cadastrados.");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.adicionarAluno("Tarcisio", 923789L, 9);
        gerenciadorAlunos.adicionarAluno("Deivid", 223789L, 7);
        gerenciadorAlunos.adicionarAluno("Igor", 411789L, 8);
        gerenciadorAlunos.adicionarAluno("Danilo", 551789L, 6);
        gerenciadorAlunos.adicionarAluno("Savio", 551789L, 5);

        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos por nota.");
        gerenciadorAlunos.exibirAlunosPorNota();

        System.out.println("Alunos por nome.");
        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.removerAlunoPorMatricula(551789L);
        System.out.println("Aluno removido");
        gerenciadorAlunos.exibirAlunos();


    }
}
