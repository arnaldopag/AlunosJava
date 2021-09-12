package aluno.Models;

public class Disciplinas {
    private int codDisciplina;
    private int idProfessor;
    private String nome;
    private int qtdTurmas;

    public Disciplinas(int codDisciplina,int idProfessor, String nome, int qtdTurmas) {
        this.codDisciplina = codDisciplina;
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.qtdTurmas = qtdTurmas;

    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

}
