package aluno;
import java.util.ArrayList;
import java.util.Date;

public class Aluno extends Pessoas {
	

	private ArrayList<Disciplinas> materiasMatriculadas;

	public Aluno(int idPessoa, String nome, Date nascimento, String fone, String cpf, String email) {
		super(idPessoa, nome, nascimento, fone, cpf, email);

	}
	public ArrayList<Disciplinas> getMateriasMatriculadas() {
		return materiasMatriculadas;
	}

	public void setMateriasMatriculadas(ArrayList<Disciplinas> materiasMatriculadas) {
		this.materiasMatriculadas = materiasMatriculadas;
	}


}
	
	