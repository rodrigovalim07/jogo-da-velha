package uninter;

public class ComputadorC extends Computador {
	public	int lista[][] = new int[9][2];	//matriz para as jogadas do computador
	public int quant;	//variavel para saber a quantidade que ainda tem de possiveis jogadas
	public int local;	//variavel para armazenamento do local que sera a jogada na lista
		

		void jogar(Tabuleiro tab) {
			int linha;	//linha que o computados vai jogar
			int coluna;	//coluna que ele ira jogar
			for(int i = 0; i < tab.mat.length; i++) {	//passando por todas as linhas da matriz
				for(int j = 0; j < tab.mat.length; j++) {	//todas as colunas
					if(tab.mat[i][j] != 1) {	//verificando se a posição esta vazia
						if(tab.mat[i][j] != -1) {
							local++;	//se a posição estiver vazia ela recebe +1
							lista[local][0] = i;	//gravando na lista  a posição
							lista[local][1] = j;
						}
					}
				}				
			}

			if(local > 0) {	//nesse nivel de dificuldade, o computador vai sempre jogar na ultima posição -1, entao por isso o local sempre tem que ser maior que 0
				quant = local -1;
			}
			else {
				quant = 0; //se tiver uma posição só entao a quant recebe 0
			}
			
			linha = lista[quant][0];	//linha recebendo seu valor
			coluna = lista[quant][1];	//coluna recebendo seu valor
			tab.mat[linha][coluna] = -1;	//colocando a posiçao dentro da matriz da classe tabuleiro
			local = 0;	//resetando a variavel local para as demais jogadas do computador
	}	
		
}
