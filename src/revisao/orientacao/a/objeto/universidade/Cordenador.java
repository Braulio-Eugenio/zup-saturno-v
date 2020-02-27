package revisao.orientacao.a.objeto.universidade;

public class Cordenador extends Funcionario {

	Professor professorSupervisionado[] = new Professor[10];

	public Cordenador(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario,
			int professoresSupervisionados) {
		super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

	}

	public boolean adicionaProfessor(Professor professorSupervisionado) {
		boolean foiAdicionado = false;
		for (int i = 0; i <= this.professorSupervisionado.length; i++) {
			if (this.professorSupervisionado[i] == null) {
				this.professorSupervisionado[i] = professorSupervisionado;
				foiAdicionado = true;
				break;
			}

		}
		return foiAdicionado;
	}

	public Professor[] getProfessorSupervisionado() {
		return professorSupervisionado;
	}

	public void setProfessorSupervisionado(Professor[] professorSupervisionado) {
		this.professorSupervisionado = professorSupervisionado;
	}

	@Override
	public void aumentoSalario() {
		super.setSalario(super.getSalario() * 0.05 + getSalario());

	}

}
