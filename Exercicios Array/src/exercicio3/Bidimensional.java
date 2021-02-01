package exercicio3;

public class Bidimensional {

	public static void main(String[] args) {
		// Declaração do array bidimensional
		int[][] array = new int[100][100];
		
		// Inserção dos elementos
		for(int i=0;i<array.length;++i) {
			for(int j=0;j<array[i].length;++j) {
				array[i][j] = i-j;
			}
		}
		
		// Mostra os elementos do array
		mostrar(array);
		
		// Multiplicação dos elementos por 7
		for(int i=0;i<array.length;++i) {
			for(int j=0;j<array[i].length;++j) {
				array[i][j] *= 7;
			}
		}
		
		// Mostra os elementos do array
		mostrar(array);
	}
	
	// Método estático que mostra os elementos do array
	public static void mostrar(int[][] array) {
		System.out.println("Array: ");
		for(int i=0;i<array.length;++i) {
			for(int j=0;j<array[i].length;++j) {
				System.out.println("["+i+"]["+j+"]= "+array[i][j]);
			}
		}
	}
}