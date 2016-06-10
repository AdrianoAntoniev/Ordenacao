package entidades;

public class BubbleSortRapido implements ResponsavelPorOrdenacao {

	@Override
	public int[] ordenar(int[] vetor) {
		int tamanho = vetor.length;
		
		for (int i=tamanho-1; i>0; i--) {
			int aux = 0;
			for (int j=0; j<i; j++) {
				if (vetor[j] > vetor[j+1]) {
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		return vetor;		
	}

}
