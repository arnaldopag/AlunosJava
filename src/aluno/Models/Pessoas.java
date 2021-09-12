package aluno.Models;

import java.util.Date;
import java.util.List;

public class Pessoas {
    private int idPessoa;
    private String nome;
    private Date nascimento;
    private String fone;
    private String cpf;
    private String email;
    private String ocupacao;

    public Pessoas(int idPessoa, String nome, Date nascimento, String fone, String cpf, String email,String ocupacao) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.nascimento = nascimento;
        this.fone = fone;
        this.cpf = cpf;
        this.email = email;
        this.ocupacao = ocupacao;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "idPessoa=" + this.idPessoa +
                ", nome='" + this.nome + '\'' +
                ", nascimento=" + this.nascimento +
                ", fone='" + this.fone + '\'' +
                ", cpf='" + this.cpf + '\'' +
                ", email='" + this.email + '\'' +
                ", ocupação: " + this.ocupacao +
                '}';
    }
}


