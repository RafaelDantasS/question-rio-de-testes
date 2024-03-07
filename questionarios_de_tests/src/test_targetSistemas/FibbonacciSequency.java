package test_targetSistemas;

import java.util.Random;

public class FibbonacciSequency {

	public static void main(String[] args) {
		Random rand = new Random();
		int indice = rand.nextInt(20);
		int [] numeros = new int [indice]; 
		
		for(int i = 0; i < indice; i++) {
			if(i <= 1) {
			
				numeros[i] = i;
			
			}else {
				
				numeros[i] = numeros[i-1] + numeros[i-2];
			
			}
		}
		System.out.println(indice);
		System.out.println(numeros[indice-1]);

	}

}
