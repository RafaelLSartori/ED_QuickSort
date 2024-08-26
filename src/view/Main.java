package view;

import controller.QuickSort;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {33, 17, 100, 99, 61, 85, 22};
		
		QuickSort sort = new QuickSort();
		int fim = vetor.length - 1;
		int inicio = 0;
		sort.quickSort(vetor, inicio, fim);
		
		for(int i : vetor) {
			System.out.print(i + " ");
		}
	}

}
