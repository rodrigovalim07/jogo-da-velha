package uninter;

import java.util.Scanner;

public class Jogador {
	Scanner teclado = new Scanner(System.in);

	
		public void jogar(Tabuleiro tab) {	//metodo jogar, recebendo como parametro a classe tabuleiro
			int linha;	//variavel que vai receber a linha da jogada
			int coluna;	//variavel que vai receber a coluna da jogada	

			System.out.print("Em qual linha deseja jogar? (1, 2, 3): ");	//opcoes pro jogador escolher onde vai jogar
			linha = teclado.nextInt();
			
			while (linha > 2 || linha < 0) {	//verificando se a linha foi digitada dentro dos limites
				System.out.print("Valor inválido, tente uma linha disponível: ");
				linha = teclado.nextInt();
				tab.visualizar();
			}
			
			System.out.print("Em qual coluna deseja jogar? (1, 2, 3): ");	//opção para a coluna
			coluna = teclado.nextInt();
			
			while (coluna > 2 || coluna < 0) {	//verificando se a linha foi digitada dentro dos limites
				System.out.print("Valor inválido, tente uma coluna disponível: ");
				coluna = teclado.nextInt();
				tab.visualizar();
			}
			
			
			while (tab.mat[linha][coluna] == 1 || tab.mat[linha][coluna] == -1) {	//verificando se a posição que o jogador escolheu esta ocupada
				System.out.println("Espaço ja preenchido, digite um espaço vazio");
				System.out.println();
				tab.visualizar();
				System.out.print("Em qual linha deseja jogar? (1, 2, 3): ");	//perguntando linha e coluna de novo, ate que seja uma váldia
				linha = teclado.nextInt();
				System.out.print("Em qual coluna deseja jogar? (1, 2, 3): ");
				coluna = teclado.nextInt();
				System.out.println();
			}
			
			tab.mat[linha][coluna] = 1;	//posiçaõ esolhida recebe 1
			
	}
}
