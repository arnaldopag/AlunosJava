package aluno.Main;
import aluno.Cadastro;
import aluno.Views.MostrarPessoas;

import java.text.ParseException;
import java.util.Scanner;

public class Escola {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("===Menu Escola====");
			System.out.println("1- Cadastro Professor");
			System.out.println("2 - Cadastro Aluno");
			System.out.println("3 - Cadastro Disiplinas");
			System.out.println("4 - Cadastro Notas ");
			System.out.println("5 - Pessoas Cadastradas");
			System.out.println("6 - Disciplinas Cadastradas ");
			System.out.println("0 -Sair");
			opcao = sc.nextInt();
			if (opcao == 1){
				Cadastro.CadastroProfessor();
			}else if (opcao == 2){
				Cadastro.CadastroAluno();
			}else if (opcao == 3){
				System.out.println(Cadastro.CadastroMaterias());
			}else if (opcao == 4){
				System.out.println(Cadastro.CadastroNotas());
			}else if(opcao == 5){
				MostrarPessoas.MostrarPessoas();

			}else if(opcao == 6){

			}else{
				System.out.println("opcao Invalida!!!");
			}
		} while (opcao != 0);
	}
}