package aplicacao;

import java.util.Arrays;

public class Programa {
	//ValorGlobal valendo 3.
	public static int globalValue = 3;

	public static void main(String[] args) {
		//Criando um vetor com os valores 
		int[] vect = new int[] { 3, 4, 5 };
		//Mude os valores impares, passando o vetor
		/*
		 * O comportamento dessa fun��o, n�o depende exatamente
		 * da fun��o e sim do valor externo que � o globalValue
		 * 
		 * Transpar�ncia referencial � isso � quando o resultado
		 * da fun��o, depende exclusivamente dos valores de entrada.
		 * 
		 */
		changeOddValues(vect);
		//Imprimindo na tela o vetor.
		System.out.println(Arrays.toString(vect));
	}

	public static void changeOddValues(int[] numbers) {
		//Essa fun��o pega o vetor e pecorre o vetor
		for (int i = 0; i < numbers.length; i++) {
			/*E vai testar
			 * Se esse vetor na posi��o i
			 * se o resto da divis�o por 2 for diferente de zero
			 * isso significa que o numero � impar
			 * vou acrescentar o valorGlobal nele. */
			if (numbers[i] % 2 != 0) {
				numbers[i] += globalValue;
			}
		}
	}
}