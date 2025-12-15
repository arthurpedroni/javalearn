import java.util.Scanner;
public class Main
{


	public static int[] ler(int[] v) {
		Scanner s = new Scanner(System.in);
		for(int x = 0; x < v.length; x++) {
			v[x] = s.nextInt();
		}
		return v;
	}

	public static int ex1(int[] v) {
		int mais = 0;
		int ele = 0;
		for(int x = 0; x < 10; x++) {
			int cont = 0;
			for(int i = 0; i < 10; i++) {
				if(v[x] == v[i]) {
					cont++;
				}
			}
			if(mais < cont) {
				ele = v[x];
				mais = cont;
			}
		}
		return ele;
	}

	public static void main(String[] args) {
		int opcao = 1;
		switch (opcao) {
			case 1:{
				int[] v = new int[10];
				v = ler(v);
				int ele = ex1(v);
				System.out.println("O que mais aparece C) " + ele);
				break;
			}
			case 2:{
				int[] v = new int[10];
				v = ler(v);
				int ele = ex1(v);
				System.out.println("O que mais aparece C) " + ele);
				break;
			}
		}

		
	}
}
