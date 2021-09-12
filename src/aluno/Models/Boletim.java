package aluno.Models;

public class Boletim {
    private int idDisciplina;
    private int idAluno;
    private int idProfessor;
    private double [] notas = new double[3];

    public Boletim(int idDisciplina, int idAluno, int idProfessor, double[] notas) {
        this.idDisciplina = idDisciplina;
        this.idAluno = idAluno;
        this.idProfessor = idProfessor;
        this.notas = notas;
    }
    public int getIdDisciplina() {
        return idDisciplina;
    }
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
