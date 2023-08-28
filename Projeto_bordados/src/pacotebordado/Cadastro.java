package pacotebordado;

public class Cadastro {
	private int identificacao;
	private int numDeLinhas;
	private int numDeColunas;
	private Bordados[] bordadosCadastrados = new Bordados[10];
	
	public Cadastro() {
		
	}
	
	public int getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}

	public int getNumDeLinhas() {
		return numDeLinhas;
	}

	public void setNumDeLinhas(int numDeLinhas) {
		this.numDeLinhas = numDeLinhas;
	}

	public int getNumDeColunas() {
		return numDeColunas;
	}

	public void setNumDeColunas(int numDeColunas) {
		this.numDeColunas = numDeColunas;
	}
	
	public void adicionaBordado(int id, int lin, int col) {
		bordadosCadastrados[id] = new Bordados(id,lin,col);
	}
	
}
