package entidades;

public class BubbleSortLento implements ResponsavelPorOrdenacao {	

	@Override
	public int[] ordenar(int[] vetor) {
		int tamanho = vetor.length;
		
		for (int i=0; i<tamanho-1; i++) {
			int aux = 0;
			for (int j=i; j<tamanho; j++) {
				if (vetor[i] > vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		return vetor;
	}

}
