package uninter;

public class Tabuleiro {
	public int mat[][] = new int[3][3];	//criando a matriz do tabuleiro
	
		//criando o metodo situação, 1 significa que a partida continua, 2 o jogador venceu e 3 o computador venceu 
		public int situacao() {
			int continua = 1;	//variavel continua, se ele continuar valendo 1 é porque as jogadas acabaram
			
			//passando por toda a matriz, para verificar se tem espaços ainda nao ocupados, se ainda tiver espaços nao ocupados o valor da variavel muda para 0
			for(int i = 0; i< mat.length; i++) {	//linhas
				for(int j = 0; j < mat.length; j++) {	//colunas
					if(mat[i][j]!= 1) {
						if(mat[i][j]!= -1) {
							continua = 0;				
						}
					}
				}				
			}
			
			//verificando se o jogador venceu
			if ((mat[0][0] == 1 && mat[0][1]== 1 && mat[0][2]== 1) || //horizontal
				(mat[1][0] == 1 && mat[1][1]== 1 && mat[1][2]== 1) || //horizontal
				(mat[2][0] == 1 && mat[2][1]== 1 && mat[2][2]== 1) || //horizontal
				(mat[0][0] == 1 && mat[1][0]== 1 && mat[2][0]== 1) || //vertical
				(mat[0][1] == 1 && mat[1][1]== 1 && mat[2][1]== 1) || //vertical
				(mat[0][2] == 1 && mat[1][2]== 1 && mat[2][2]== 1) ||	//vertical
				(mat[0][0] == 1 && mat[1][1]== 1 && mat[2][2]== 1) || //diagonal
				(mat[2][0] == 1 && mat[1][1]== 1 && mat[0][2]== 1)) {	//diagonal
				 return 2;
			}
			//verificando se a máquina ganhou
			else if ((mat[0][0] == -1 && mat[0][1]== -1 && mat[0][2]== -1) || //horizontal
					 (mat[1][0] == -1 && mat[1][1]== -1 && mat[1][2]== -1) || //horizontal
					 (mat[2][0] == -1 && mat[2][1]== -1 && mat[2][2]== -1) || //horizontal
					 (mat[0][0] == -1 && mat[1][0]== -1 && mat[2][0]== -1) || //vertical
					 (mat[0][1] == -1 && mat[1][1]== -1 && mat[2][1]== -1) || //vertical
					 (mat[0][2] == -1 && mat[1][2]== -1 && mat[2][2]== -1) || //vertical
					 (mat[0][0] == -1 && mat[1][1]== -1 && mat[2][2]== -1) || //diagonal
					 (mat[2][0] == -1 && mat[1][1]== -1 && mat[0][2]== -1)) { //diagonal
				return 3;
			}
			//verificando se tem posições para preencher
			else if(continua == 0) {
				return 0;

			}
			else {	//se todas posições estiverem preenchidas e ninguem ganhou, entao empatou
				return 1;
			}
		}

		
		public void visualizar() {	//metodo visualizar, para imprimir o tabuleiro
			System.out.println("    Tabuleiro");
			
			
			for(int i = 0; i < mat.length; i++) {	//linhas
				System.out.println("  +---+---+---+");
				System.out.print("  |");
				for(int j = 0; j < mat.length; j++) { //colunas
					if(mat[i][j] == 1) {
						if (j < 2) {
							System.out.print(" X |");
						}
						else {
							System.out.println(" X |");
						}
					}
					else if(mat[i][j] == -1) {
						if (j < 2) {
							System.out.print(" O |");
						}
						else {
							System.out.println(" O |");
						}
					}
					else {
						if(j < 2) {
							System.out.print("   |");
						}
						else {
							System.out.println("   |");
						}
					}
				}
			}
		System.out.println("  +---+---+---+");
		System.out.println();

		}
		
}
