package aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Escola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			List<Aluno> listaAluno = new ArrayList<>();
			  
			
			
			System.out.println("Quantos alunos serão Cadastrados: ");
			int n = sc.nextInt();
			
			for(int i = 0;i < n;i++) {
				 System.out.print("Codigo Aluno: ");
				    int cod = sc.nextInt();
				    while (hasId(listaAluno, cod)) {
						System.out.print("Código existente, digite outro: ");
						cod = sc.nextInt();
					}
				System.out.print("Nome Aluno: ");
				String nome = sc.next();
			    System.out.print("Idade Aluno: ");
			    int idade = sc.nextInt();
			   
			    System.out.print("Disciplina: ");
			    String disciplina = sc.next();
			    System.out.print("Media: ");
			    double media = sc.nextDouble();
			    
			    
			    
			    Aluno al = new Aluno(nome, idade, cod,media,disciplina);
			    listaAluno.add(al);
		    	
			    System.out.println("Nome: " + al.getNome());
			    System.out.println("Código: " + al.getCod());
			    System.out.println("Idade: " + al.getIdade());
			    System.out.println("Nome: " + al.getDisciplina() + " Media: " + al.getMedia());
			}
			
	   }
	public static boolean hasId(List<Aluno> list, int cod) {
		Aluno al = list.stream().filter(x -> x.getCod() == cod).findFirst().orElse(null);
		return al != null;
	}
}
