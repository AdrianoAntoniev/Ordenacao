package testes;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import entidades.BubbleSortLento;
import entidades.ResponsavelPorOrdenacao;

public class TesteBubble {
	static ResponsavelPorOrdenacao ordenador;
	static int[] vetor;
	static int[] vetorOrdenado;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ordenador = new BubbleSortLento();
		vetor = new int[] {7,4,5,2,3,1,6};
		vetorOrdenado = new int[] {1,2,3,4,5,6,7};
	}

	@Test
	public void test() {
		assertEquals(vetorOrdenado[1], ordenador.ordenar(vetor)[1]);				
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}


}
