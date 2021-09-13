package aluno;

import aluno.Models.Aluno;
import aluno.Models.Disciplinas;
import aluno.Models.Pessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class Matricula {
    private static List<Pessoas> listaPessoas = Cadastro.getListaPessoas();
    private static List<Disciplinas> listaDisciplinas = Cadastro.getListaDisciplinas();
    private static List<Aluno> listaAlunos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static String MatricularAluno(int id){

        if(listaDisciplinas.isEmpty()){
            String retorno = "====Erro====";
            retorno += "Nenhum Aluno Cadastrado";
            return retorno;
        }
        if(Cadastro.VerificaOcupacao(listaPessoas,id)){
            String retorno = "====Erro====";
            retorno += "Apenas Professores Podem Matricular Alunos";
            return retorno;
        }
        System.out.println("Quantos Alunos Serao matriculados: ");
        int nAlunos =  sc.nextInt();
        for(int i = 0; i<=nAlunos; i++){
            System.out.println("Codigo Aluno: ");
            int codAluno = sc.nextInt();
            Pessoas acharAluno = listaPessoas.stream().filter(x -> x.getIdPessoa() == codAluno).findAny().orElse(null);
            listaAlunos.add((Aluno) acharAluno);
        }
        System.out.println("Codigo da disciplina: ");
        int codDisciplina = sc.nextInt();
        Disciplinas disciplina = listaDisciplinas.stream().filter(x -> x.getCodDisciplina() == codDisciplina).findFirst().orElse(null);
        disciplina.setAlunosMatriculados(listaAlunos);
        String retorno = "Aluno Matriculado!!!!\n";
        retorno += "Nome Disciplina: " + disciplina.getNome();
        return retorno;
    }
}
