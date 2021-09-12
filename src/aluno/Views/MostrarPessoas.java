package aluno.Views;
import aluno.Cadastro;
import aluno.Models.Boletim;
import aluno.Models.Disciplinas;
import aluno.Models.Pessoas;

import java.util.List;

public final class MostrarPessoas {
    private static List<Pessoas> listaPessoas = Cadastro.getListaPessoas();
    private  List<Disciplinas> listaDisciplinas = Cadastro.getListaDisciplinas();
    private  List<Boletim> listBoletim = Cadastro.getListaNotas();

    public static void MostrarPessoas(){

        for (Pessoas pessoa :listaPessoas) {
            if(pessoa.getOcupacao() == "Aluno"){
                System.out.println("=====Lista de alunos Matriculados=====");
                System.out.println("Codigo Aluno:" + pessoa.getIdPessoa());
                System.out.println("Nome Aluno:" + pessoa.getNome());
                System.out.println("Email Aluno:" + pessoa.getEmail());
                System.out.println("Fone Aluno:" + pessoa.getFone());
                System.out.println("Data Nascimento Aluno:" + pessoa.getNascimento());
                System.out.println("Cpf Aluno:" + pessoa.getCpf());
                System.out.println("=======================================");
            }else{
                System.out.println("=====Lista de Profesores Cadastrados=====");
                System.out.println("Codigo Professor:" + pessoa.getIdPessoa());
                System.out.println("Nome Professor:" + pessoa.getNome());
                System.out.println("Email Professor:" + pessoa.getEmail());
                System.out.println("Fone Professor" + pessoa.getFone());
                System.out.println("Data Nascimento Professor:" + pessoa.getNascimento());
                System.out.println("Cpf Professor:" + pessoa.getCpf());
                System.out.println("Cpf Professor:" + pessoa.get);
                System.out.println("=======================================");
            }
        }



    }


}
