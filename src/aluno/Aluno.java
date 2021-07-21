package aluno;
import java.util.List;
import java.util.ArrayList;

public class Aluno {
	
  
	private String nome;
	private int idade;
	private int id; 
	private double [] notas = new double [3];
	private String [] disciplinas = new String [3];
	
	
	
	public Aluno(String nome, int idade, int id, double[] notas, String[] disciplinas) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.id = id;
			this.notas = notas;
			this.disciplinas = disciplinas;
		}
	
	
	
}
