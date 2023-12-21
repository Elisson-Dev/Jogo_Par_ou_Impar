/* @Software: Jogo Par ou Impar
 * @Autor: Elisson Luiz Santos da Silva
 * @E-mail: elissonfreelancer@gmail.com
 * @Licença: GPL-3.0 license
 * @Criado em: 21/12/2023
 * @Versão: 0.1 - Alterado em 21/12/2023
 * 
 * 
 * -->> Classe responsável pela criação do Jogador
 */
package biblio;

// Classe do Jogador
public class Jogador {

	// Atributos do jogador
	private String nomeJogador, sobreNomeJogador;
	private int idadeJogador;
	
	// Atributos do opositor
	
	
	// Constructor do jogador
	public Jogador (String nomeJogador, String sobreNomeJogador, int idadeJogador) {
		this.nomeJogador = nomeJogador;
		this.sobreNomeJogador = sobreNomeJogador;
		this.idadeJogador = idadeJogador;
	}
	
	// Getters e Setters dos atributos do jogador
	
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nome) {
		this.nomeJogador = nomeJogador;
	}
	public String getSobreNomeJogador() {
		return sobreNomeJogador;
	}
	public void setSobreNomeJogador(String sobreNome) {
		this.sobreNomeJogador = sobreNome;
	}
	public int getIdadeJogador() {
		return idadeJogador;
	}

	// TODO Retorna informações do jogador
	public void infoJogador() {	}
	
	// TODO Retorna o nivel de sorte do jogador (inteiro que irá subtrair possibilidades do jogo)
	public void sorteJogador() { }
	
	
}	


