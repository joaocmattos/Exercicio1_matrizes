package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// criaçao da matriz
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
		int x = sc.nextInt();
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				if (mat[i][j] == x) {
					System.out.println("Position "+ i + "," + j + ":");
					// para a esquerda
					if (j > 0) {
						System.out.println("Left: "+ mat[i][j - 1]);
					}
					// para cima
					if(i > 0) {
						System.out.println("Up: "+ mat[i - 1][j]);
					}
					// para a direita
					if (j < n - 1) {
						System.out.println("Right: "+ mat[i][j + 1]);
					}
					// para baixo
					if(i < m - 1) {
						System.out.println("Down: "+ mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();

	}

}
