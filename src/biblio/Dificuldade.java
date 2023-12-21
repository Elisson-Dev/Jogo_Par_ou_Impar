/* @Software: Jogo Par ou Impar
 * @Autor: Elisson Luiz Santos da Silva
 * @E-mail: elissonfreelancer@gmail.com
 * @Licença: GPL-3.0 license
 * @Criado em: 18/12/202
 * @Versão: 0.1 - 18/12/2023
 *
 * 
 * -->> Classe responsável pela análise de dificuldade do jogo
 */

package biblio;
import java.util.Random;

public class Dificuldade {
	
	Random rand = new Random();
	
	public int dificuldade(int point) {
		return (rand.nextInt(point));
	}
	
}
