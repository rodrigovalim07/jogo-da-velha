package uninter;

import java.util.Random;

public class ComputadorB extends Computador {
	public int quant;	//variavel para saber a quantidade que ainda tem de possiveis jogadas
	public	int lista[][] = new int[9][2];	//matriz para as jogadas do computador
	public int local;	//variavel para armazenamento do local que sera a jogada na lista
	public Random aleatorio = new Random();	//novo objeto random para as jogadas aleatorias
		

		void jogar(Tabuleiro tab) {
			int linha;	//linha que o computados vai jogar
			int coluna;	//coluna que ele ira jogar
			for(int i = 0; i < tab.mat.length; i++) {	//passando por todas as linhas da matriz
				for(int j = 0; j < tab.mat.length; j++) {	//todas as colunas
					if(tab.mat[i][j] != 1) {	//verificando se a posi��o esta vazia
						if(tab.mat[i][j] != -1) {
							local++;	//se a posi��o estiver vazia ela recebe +1
							lista[local][0] = i;	//gravando na lista  a posi��o
							lista[local][1] = j;
						}
					}
				}				
			}

			if(local > 0) {	//depois de varrer a matriz e ver que ainda tem mais de uma posi��o, a variavel quant recebe um valor aleatorio entre 0 e a quantidade de posi��es
				quant = aleatorio.nextInt(local);
			}
			else {
				quant = 0; //se tiver uma posi��o s� entao a quant recebe 0
			}
			
			linha = lista[quant][0];	//linha recebendo seu valor
			coluna = lista[quant][1];	//coluna recebendo seu valor
			tab.mat[linha][coluna] = -1;	//colocando a posi�ao dentro da matriz da classe tabuleir
			local = 0;	//resetando a variavel local para as demais jogadas do computador
	}
		
}