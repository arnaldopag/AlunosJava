package aluno.Main;
import aluno.Cadastro;
import aluno.Matricula;
import aluno.Views.MostrarDisciplinas;
import aluno.Views.MostrarPessoas;

import java.text.ParseException;
import java.util.Scanner;

public class Escola {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;

			System.out.println("===Menu Escola====");
			System.out.println("1 - Cadastros ");
			System.out.println("2 - Matricular Aluno");
			System.out.println("3 - Litagem Alunos / Professores");
			System.out.println("4 - Listagens Disciplinas ");
			System.out.println("0 -Sair");
			opcao = sc.nextInt();
			if (opcao == 1){
				Cadastro.Menu();
			}else if (opcao == 2){
				System.out.println("Seu Codigo : ");
				int codProfessor = sc.nextInt();
				Matricula.MatricularAluno(codProfessor);
			}else if(opcao == 3){
				MostrarPessoas.MostrarPessoas();
			}else{
				System.out.println("opcao Invalida!!!");
			}

	}
}