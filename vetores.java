import java.util.Scanner;
public class vetores
{

	public static int[] ler(int[] v) {
		Scanner s = new Scanner(System.in);
		for(int x = 0; x < v.length; x++) {
			v[x] = s.nextInt();
		}
		return v;
	}

	public static int maiorqtd(int[] v) {
		int mais = 0;
		int resultado = 0;
		for(int x = 0; x < 10; x++) {
			int cont = 0;
			for(int i = 0; i < 10; i++) {
				if(v[x] == v[i]) {
					cont++;
				}
			}
			if(mais < cont) {
				resultado = v[x];
				mais = cont;
			}
		}
		return resultado;
	}
	public static int[] verNumNaoDig() {
		Scanner s = new Scanner(System.in);
		int[] num = {0,0,0,0,0,0,0,0,0,0};
		int[] resultado = new int[10];
		int n = s.nextInt();
		while(n > 0){
			num[n - 1] = 1;
			n = s.nextInt();
		}
		int cont = 0;
		for(int x = 0;x < resultado.length;x++){
			if(num[x] == 0){
				resultado[cont] = x + 1;
				cont++;
			}
		}
		return resultado;	
	}
	public static void main(String[] args) {
		int opcao = 2;
		switch (opcao) {
			case 1:{
				System.out.println("Elemento que mais aparece no vetor");
				int[] v = new int[10];
				v = ler(v);
				int resultado = maiorqtd(v);
				System.out.println("O que mais aparece é " + resultado);
				break;
			}
			case 2:{
				System.out.println("Digite números entre 1 e 10. Digite um número negativo para encerrar.");
				int[] resultado = verNumNaoDig();
				for(int x = 0;resultado[x] != 0;x++){
					System.out.println("Números não digitados: " + resultado[x]);
				}
				break;
			}
		}

		
	}
}
