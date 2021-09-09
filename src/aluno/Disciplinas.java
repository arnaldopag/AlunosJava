package aluno;

public class Disciplinas {
    private int codDisciplina;
    private String nome;
    private int qtdTurmas;
    private double media;
    private double [] notas = new double [3];

    public Disciplinas(int codDisciplina, String nome, int qtdTurmas, double media, double[] notas) {
        this.codDisciplina = codDisciplina;
        this.nome = nome;
        this.qtdTurmas = qtdTurmas;
        this.media = media;
        this.notas = notas;
    }

    public int getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(int codDisciplina) {
        this.codDisciplina = codDisciplina;
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
