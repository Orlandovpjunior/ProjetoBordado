package pacotebordado;
import java.util.Scanner;

public class Menu {
	private String escolha;
	private String[] opcoes = {"A", "B", "C", "D","E","F","G","H","I","J"};
	private String[] acoes = {"Cadastrar bordado","Atualizar bordado","Imprimir bordado","Listar bordados","Alterar tamanho do bordado","Cadastrar compra","Imprimir compra"};
	private Cadastro cadastro;
//	private Atualiza atualiza;
//	private Imprime imprime;
//	private Listar listagem;
//	private Alterar editar;
//	private CadastrarCompra cadastrarCompra;
//	private ImprimeCompra imprimeCompra;
	
	
	public Menu() {
	
	}
	
	public void escolhaDeAcao(String escolha) {
		Scanner scanner = new Scanner(System.in);
		Cadastro cadastrar = new Cadastro();
		if(escolha.equals("A")) {
			System.out.println("Numero do bordado?[0-9]");
			int numBordado = scanner.nextInt();
			System.out.println("Numero do bordado?[2-100]");
			int numLinhas = scanner.nextInt();
			System.out.println("Numero do bordado?[2-100]");
			int numColunas = scanner.nextInt();
			cadastrar.adicionaBordado(numBordado,numLinhas,numColunas);
		}
	}
	
	public String exibeMenu() {
		StringBuffer out = new StringBuffer();
		for(int i = 0; i < this.acoes.length;i++) {
			out.append(opcoes[i] + " - " + acoes[i] + "\n");
		}
		out.append("\nVoce pode cadastrar 10 bordados. O que deseja fazer?");
		return out.toString();
	}
}
