package br.com.zup.estrelas.saturnov.universidade;

public class ProgramaFuncionarioAdm {

	public static void main(String[] args) {
		FuncionarioAdministrativo funcionarioAdm = new FuncionarioAdministrativo("Ja�ton Cleber Macedo Filomeno", "1891035488-8", "94454115-15",
				"UFU", 3945.83, "ASS. ADMINISTRATIVO", "PLENO");
		System.out.println("NOME DO COLABORADOR : " + funcionarioAdm.getNome());
		System.out.println("FUN��O : " + funcionarioAdm.getFuncaoAdministrativa()+" NIVEL: "+funcionarioAdm.getSenioridade());
		System.out.println("N�MERO DE REGISTRO : " + funcionarioAdm.getNumeroDeRegistro() );
		System.out.println("CPF : " + funcionarioAdm.getCpf());
		System.out.println("ORG�O DE LOTA��O : " + funcionarioAdm.getOrgaoDeLotacao());
		System.out.println("SALARIO ANTERIOR AO AUMENTO R$: " + funcionarioAdm.getSalario());
		funcionarioAdm.aumentoDeSalario();
		System.out.println("SALARIO ATUAL COM O AUMENTO DE 10% DO COLABORADOR R$: " + funcionarioAdm.getSalario());
		
	}

}
