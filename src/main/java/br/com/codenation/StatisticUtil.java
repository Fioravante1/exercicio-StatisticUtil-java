package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int media = 0;
		for (int element : elements) {
			media += element;
		}
		return (int) ((float) media / elements.length);
	}

	public static int mode(int[] elements) {
		int frequenciaNumeros = 0;

		for (int i = 1; i < elements.length; i++) {
			if (elements[i] == elements[i - 1] && frequenciaNumeros != elements[i - 1]) {
				frequenciaNumeros = elements[i];
			}
		}
		return frequenciaNumeros;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int medianResult = 0;

		if (elements.length % 2 != 0) {
			int indexMedian = elements.length / 2;
			medianResult = elements[indexMedian];
		} else {
			int value1 = elements.length / 2;
			int value2 = elements.length / 2 - 1;
			medianResult = (elements[value1] + elements[value2]) / 2;
		}
		return medianResult;
	}
}