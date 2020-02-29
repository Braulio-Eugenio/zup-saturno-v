package revisao.orientacao.a.objeto.universidade;

public class ProgramaFuncionario {

	public static void main(String[] args) {
	
	Cordenador cordenador = new Cordenador("Fabio", "15204578","15242245", "USP", 22358, 0);
	System.out.println("Salario anterior ao aumento R$: " + cordenador.getSalario());
	cordenador.aumentoSalario();
  	System.out.println("Salário com reajuste de 5 % soma o total de  R$:" + cordenador.getSalario());
	
	
	}

}
