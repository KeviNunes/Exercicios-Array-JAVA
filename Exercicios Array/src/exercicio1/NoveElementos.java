package exercicio1;

public class NoveElementos {

	public static void main(String[] args) {
		// Declaração do array
		int[] array9 = new int[9];
		
		// Inserção dos elementos
		for(int i=0; i<array9.length;++i) {
			array9[i]=i;
		}
		
		// Mostra os elementos do array
		mostrar(array9);
		
		// Multiplica todos os elementos por 3
		for(int i=0;i<array9.length;++i) {
			array9[i] *= 3;
		}
		
		// Mostra os elementos do array
		mostrar(array9);
	}
	
	// Método estático que mostra os elementos do array
	public static void mostrar(int[] array) {
		System.out.println("Array: ");
		for(int i=0;i<array.length;++i) {
			System.out.println("["+i+"] = "+array[i]);
		}
	}
}