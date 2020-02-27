package revisao.orientacao.a.objeto;

public class ProgramaElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador(0, 12, 10, 0);
		elevador.setAndarAtual(0);
		elevador.setQtdPessoas(0);
		System.out.println(elevador.getAndarAtual());
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
	
		
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		elevador.desce();
		
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		elevador.sobe();
		
		
		System.out.println(elevador.getAndarAtual());
		
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		elevador.entra();
		
		
	}

	
	
}
