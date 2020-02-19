/**
 * Classe para testar os metodos da classe aluno
 * @author pbido
 * @since 12/02/2020
 * @version 0.1
 */

package exec06;

import java.text.ParseException;

public class TestarAluno {
	public static void main(String[] args) throws ParseException {

		Aluno aluno = new Aluno("Pedro Henrique dos Santos Bido", 2000, "04/06/2000", "Engenharia da computação",
				"Osasco");
		aluno.calcularIdade();
		aluno.exibirTudo();

	}
}
