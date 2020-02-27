package revisao.orientacao.a.objeto.universidade;

public class FuncionarioAdm extends Funcionario {
	private String funcaoAdm;
	private String senioridade;
	public FuncionarioAdm(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario, String funcaoAdm, String senioridade) {
		super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
		this.funcaoAdm = funcaoAdm;
		this.senioridade = senioridade;
	

		
	}
	public String getFuncaoAdm() {
		return funcaoAdm;
	}
	public void setFuncaoAdm(String funcaoAdm) {
		this.funcaoAdm = funcaoAdm;
	}
	public String getSenioridade() {
		return senioridade;
	}
	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}
	@Override
	public void aumentoSalario() {
		super.aumentoSalario();
	}
}
