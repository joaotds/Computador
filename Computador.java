package modelo;

public class Computador {

	private String processador;
	
	private String memoria;
	
	private Float preco;
	
	public String getDados() {
		String dados = " - Processador: " + this.processador;
		dados += " - Memória: " + this.memoria;
		dados += " - Preço: " + this.preco.toString();
		return dados;
	}

	//GETS E SETS
	
	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
	
	
}
