package aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;



public class Escola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Aluno> list = new ArrayList<>();
		ArrayList<String> disciplinas = new ArrayList<String>();
		ArrayList<Double> notas = new ArrayList<Double>();
		
		char c;
		do {
		
			Aluno al = new Aluno(nome, idade, cod,notas, disciplinas);
			list.add(al);
			
			System.out.print("Deseja cadastrar outro Aluno, S ou  N ");
			 c = (char) sc.nextByte();
		
				}while(c == 's');
		}



	public static boolean hasCod(List<Aluno> list, int cod) {
		Aluno emp = list.stream().filter(x -> x.getCod() == cod).findFirst().orElse(null);
		return emp != null;
	}
}