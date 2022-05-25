package jogoCraps;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JogoCraps {

	public static void main(String[] args) {
		
		
		int rodada = 0;
		int seusPontos = 0;
		
		List<Integer> natural = Arrays.asList(7, 11);
		List<Integer> craps = Arrays.asList(2, 3, 12);
		List<Integer> ponto = Arrays.asList(4, 5, 6, 8, 9, 10);
		
		do {
			
			rodada++;
			int dado1 = random();
			int dado2 = random();
			
			int totalDados = dado1 + dado2;
			
			
			if (rodada == 1) {
				if (natural.contains(totalDados)) {
					System.out.printf("Você tirou %d na rodada %d e é um Natural.\n", totalDados, rodada);
					System.out.println("Você ganhou!");
					break;
				}
				else if (craps.contains(totalDados)) {
					System.out.printf("Você tirou %d na rodada %d e é um Craps.\n", totalDados, rodada);
					System.out.println("Você perdeu!");
					break;
				}
				else {
					seusPontos = totalDados;
				}
			}
			else {
				if (totalDados == seusPontos) {
					System.out.printf("Você tirou %d na rodada %d e é um Natural.\n", totalDados, rodada);
					System.out.println("Você ganhou!");
					break;
				}
				else if (totalDados == 7) {
					System.out.printf("Você tirou %d na rodada %d e é um Craps.\n", totalDados, rodada);
					System.out.println("Você perdeu!");
					break;
				}
				else {
					continue;
				}
			}
			
			
			
			
		} while (true);
		
		
		
		
		
		
	}
	
	public static int random() {
		Random random =  new Random();
		return random.nextInt(6) + 1;
	}

}
