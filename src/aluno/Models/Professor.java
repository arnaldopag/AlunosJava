package aluno.Models;

import java.util.ArrayList;
import java.util.Date;

public class Professor extends Pessoas{


    private Date dataContrato;
    private String titulacao;
    private ArrayList<Disciplinas> materias;

    public Professor(int idPessoa, String nome, Date nascimento, String fone, String cpf, String email, String ocupacao, Date dataContrato, String titulacao) {
        super(idPessoa, nome, nascimento, fone, cpf, email, ocupacao);
        this.dataContrato = dataContrato;
        this.titulacao = titulacao;
        this.materias = materias;
    }

    public Date getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }




}
