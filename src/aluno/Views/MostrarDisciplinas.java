package aluno.Views;

import aluno.Cadastro;
import aluno.Models.Aluno;
import aluno.Models.Pessoas;
import aluno.Models.Boletim;
import aluno.Models.Disciplinas;

import java.util.List;
import java.util.Scanner;

public final class MostrarDisciplinas {
    private static Scanner sc = new Scanner(System.in);
    private static List<Pessoas> listaPessoas = Cadastro.getListaPessoas();
    private static List<Disciplinas> listaDisciplinas = Cadastro.getListaDisciplinas();
    private static List<Boletim> listaNotas = Cadastro.getListaNotas();

    public static void menu(){
        int opcao = 0;
        System.out.println("Digite a opcao desejada");
        System.out.println("1 - Disciplinas Cadastradas:");
        System.out.println("2 - Notas");
        System.out.println("3 - Alunos Matriculados ");
        System.out.println(" opcao: ");
        opcao = sc.nextInt();
        if(opcao == 1){
            MostrarDisciplinas();
        }else if(opcao == 2){
            System.out.println("Digite seu codigo: ");
            int codAluno = sc.nextInt();
            MostrarNotas(codAluno);
        }else if(opcao == 3){
            System.out.println("Digite o codigo da Disciplina");
            int codDisciplina = sc.nextInt();
            AlunoDisciplinas(codDisciplina);

        }else{
            System.out.println("Opcao invalida!!!!");
        }

    }
    public static void MostrarDisciplinas(){
        for (Disciplinas disciplina : listaDisciplinas){
            System.out.println("====Disciplinas Cadastradas====");
            System.out.println("Codigo Disciplina: " + disciplina.getCodDisciplina());
            System.out.println("Nome Disciplina: " + disciplina.getNome());
            System.out.println("Professor responsavel: " + disciplina.getIdProfessor() );
            System.out.println("Quantidade de turmas Ofertadas" + disciplina.getQtdTurmas());
            System.out.println("======================================");
        }
    }
    public static void MostrarNotas(int id){
        Boletim notaAluno = listaNotas.stream().filter(x -> x.getIdAluno() == id).findAny().orElse(null);
        System.out.println("Codigo Aluno: " + notaAluno.getIdAluno());
        System.out.println("Codigo Disciplina: " + notaAluno.getIdDisciplina());
        for (int i = 0; i <= 3; i++){
            System.out.println( i + " Nota: " + notaAluno.getNotas()[i]);
        }
    }
    public static void AlunoDisciplinas(int codDiscciplina){
        Disciplinas disciplinaLocalizada = listaDisciplinas.stream().filter(x -> x.getCodDisciplina() == codDiscciplina).findFirst().orElse(null);
        System.out.println("Nome Disciplina: " + disciplinaLocalizada.getNome());
        for (Aluno aluno : disciplinaLocalizada.getAlunosMatriculados() ){
            System.out.println("Codigo Aluno" + aluno.getIdPessoa() + "Nome Aluno: " + aluno.getNome());
        }
    }
}
