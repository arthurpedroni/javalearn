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
	public static int verNumNaoDig(int[] v) {
		Scanner s = new Scanner(System.in);
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		do { 
		
		} while ();
	}
	public static void main(String[] args) {
		int opcao = 2;
		switch (opcao) {
			case 1:{
				int[] v = new int[10];
				v = ler(v);
				int resultado = maiorqtd(v);
				System.out.println("O que mais aparece é " + resultado);
				break;
			}
			case 2:{
				int[] v = new int[10];
				v = ler(v);
				int resultado = verNumNaoDig(v);
				System.out.println("O que mais aparece é " + resultado);
				break;
			}
		}

		
	}
}
