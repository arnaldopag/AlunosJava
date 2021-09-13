package aluno.Models;

import java.util.List;

public class Disciplinas {
    private int codDisciplina;
    private int idProfessor;
    private String nome;
    private int qtdTurmas;
    private List<Aluno> alunosMatriculados;

    public Disciplinas(int codDisciplina, int idProfessor,  String nome, int qtdTurmas) {
        this.codDisciplina = codDisciplina;
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.qtdTurmas = qtdTurmas;
    }



    public int getCodDisciplina() {
        return codDisciplina;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public void setAlunosMatriculados(List<Aluno> alunosMatriculados) {
        this.alunosMatriculados = alunosMatriculados;
    }
}
