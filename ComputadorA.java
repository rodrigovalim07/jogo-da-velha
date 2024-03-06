package uninter;

public class ComputadorA extends Computador {

		void jogar(Tabuleiro tab) {	//metodo jogador do computador A
			int coluna = 3;	//variavel recebendo um valor inv�lido, para a coluna onde ira receber a jogada
			int linha = 3;	//variavel recebendo um valor inv�lido, para a linha onde ira receber a jogada
			
			//passansdo pelas linhas e colunas da matriz, enquanto as variaveis linha e coluna forem 3 e tiver linhas e colunas ele ir� varrer
			for(int i = 0; i < tab.mat.length && linha == 3 && coluna == 3; i++) {//linhas
				for(int j = 0; j < tab.mat.length  && linha == 3 && coluna == 3; j++) {//colunas
					if(tab.mat[i][j] != 1) {	//certificando que a posi��o esta vazia
						if(tab.mat[i][j] != -1) {
						linha = i;	//depois de verificar que a posi��o esta vazia, coluna e linha recebe a posi��o da jogada
						coluna = j;
						}
					}
				}				
			}
			
			tab.mat[linha][coluna] = -1;	//matriz recebendo o valor da jogada do computador
	
	}
		
}
