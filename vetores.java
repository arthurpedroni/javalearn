import java.util.Scanner;
public class vetores
{

	public static int[] lerint(int[] v) {
		Scanner s = new Scanner(System.in);
		for(int x = 0; x < v.length; x++) {
			v[x] = s.nextInt();
		}
		return v;
	}

	public static double[] lerdouble(double[] v) {
		Scanner s = new Scanner(System.in);
		for(int x = 0; x < v.length; x++) {
			v[x] = s.nextDouble();
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

	public static int qtdMinima(double[] v) {
		double sum = 0;
		double soma = 0;
		for(int x = 0;x < v.length;x++){
			sum = sum + v[x];
			for(int i = x + 1;i < v.length;i++){
				if(v[i] > v[x]){
					double aux = v[i];
					v[i] = v[x];
					v[x] = aux;
				}
			}
		}
		int x;
		for(x = 0;x < v.length;x++){
			soma = soma + v[x];
			if(soma >= (sum / 2)){
				break;
			}
		}
		return x + 1;
	}
	public static void main(String[] args) {
		int opcao = 3;
		switch (opcao) {
			case 1:{
				System.out.println("Elemento que mais aparece no vetor");
				int[] v = new int[10];
				v = lerint(v);
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
			case 3:{
				System.out.println("Quantidade minima de elementos para dar a metade da soma de todos os elementos do array");
				double[] v = new double[20];
				v = lerdouble(v);
				int resultado = qtdMinima(v);
				System.out.println("São necessários "+ resultado +" elementos para dar a metade da soma");
				break;
			}
		}

		
	}
}
