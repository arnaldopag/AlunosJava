package aluno;



public class Aluno {
	
	private String nome;
	private int idade;
	private int cod; 
	
	private double media;
	private String disciplina;
	
	
	public  Aluno(String nome, int idade, int cod, double media, String disciplina) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cod = cod;
		this.media = media;
		this.disciplina = disciplina;
	}



	public  String getNome() {
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
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
}
	
	