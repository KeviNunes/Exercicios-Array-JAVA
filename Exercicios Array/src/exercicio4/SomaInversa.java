package exercicio4;

public class SomaInversa {

	public static void main(String[] args) {
		// Declaração do array bidimensional
		int[][] array = new int[50][100];
		
		// Inserção dos elementos
		for(int i=array.length-1 ; i>=0 ; --i) {
			for(int j=array[i].length-1 ; j>=0 ; --j) {
				array[i][j]=i+j;
			}
		}
	}
}