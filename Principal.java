package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro();	//novo objeto para a classe tabuleiro
		Jogador jogador = new Jogador();	//novo objeto para a classe jogador
		Scanner teclado = new Scanner(System.in);	//novo teclado para entrada de dados
		Computador comp = null;	//novo objeto pra classe computador

		System.out.println("-------- Jogo da velha --------");
		
		int opcao = 4; //variavel que vai receber a opcao do computador
		while (opcao > 3 || opcao <= 0) {	//loop para certificar que a opcao seja correta
			System.out.print("Escolha a dificuldade 1, 2 ou 3: ");
			opcao = teclado.nextInt();
			if(opcao == 1) {
				comp = new ComputadorA();
			}
			else if(opcao == 2) {
				comp = new ComputadorB();
			}
			else if(opcao == 3) {
				comp = new ComputadorC();
			}
			else {
				System.out.println("Digite um computador válido: ");
			}
		}
		
		int vez = 1;	//variavel para trocar a vez de jogador para computador e vice-versa
		
		tab.visualizar();	//metodo visualizar para mostrar o tabuleiro
		
		
		while(tab.situacao() == 0) {	//chamando o metodo situação, 0 para continuar jogando
			
			if(vez == 1) {	//Jogador Humano
				jogador.jogar(tab);	//metodo jogar passando o parametro a classe tabuleiro, para preencher a posição que o jogador jogou
				vez = 2;	//passando o valor da variavel pra 2, pra ser a vez do computador
			}
							
			else if(vez == 2) {	//Computador
				comp.jogar(tab);	//metodo jogar da classe computador, chamando a classe filha do computador fazer a jogada no tabuleiro
				vez = 1;	//passando o valor da variavel pra 1, pra ser a vez do jogador humano
			}
			
			tab.visualizar();
			
			//chamando o metodo situação, para verificar se o jogador ganhou
			if(tab.situacao() == 2) {	// 2 o jogador venceu
				System.out.println("Parabéns! você venceu o computador.");
			}
			
			else if(tab.situacao() == 3) {	// 3 o computador venceu
				System.out.println("O computador venceu!");
			}
			
			else if(tab.situacao() == 1) {	// 1 deu empate
				System.out.println("O jogo empatou (deu velha)");
			}
		}
			
		System.out.println("Fim do jogo.");
			
	}

}
