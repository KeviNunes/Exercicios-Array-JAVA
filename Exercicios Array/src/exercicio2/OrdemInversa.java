package exercicio2;

public class OrdemInversa {

	public static void main(String[] args) {
		// Declaração do array
		int[] array = new int[10];
		
		// Inserção dos elementos em ordem inversa
		for(int i=array.length-1; i>=0;--i) {
			array[i]=i;
		}
	}
}