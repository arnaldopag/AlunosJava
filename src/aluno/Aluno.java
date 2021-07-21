package aluno;

public class Aluno {
	
  
	private String nome;
	private int idade;
	private int cod; 
	private String disciplinas;
	private double notas;
	
	
	public Aluno(String nome, int idade, int cod, double notas, String disciplinas) {
			super();
			this.nome = nome;
			this.idade = idade;
			this.cod = cod;
			this.disciplinas = disciplinas;
			this.notas = notas;
		
		}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int getCod() {
		return cod;
	}



	public void setCod(int cod) {
		this.cod = cod;
	}



	public Double getNotas() {
		return notas;
	}



	public void setNotas(Double notas) {
		this.notas = notas;
	}



	public String getDisciplinas() {
		return disciplinas;
	}



	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
}
