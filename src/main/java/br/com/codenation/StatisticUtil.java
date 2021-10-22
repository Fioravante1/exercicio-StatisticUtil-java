package br.com.codenation;

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
		return 0;
	}
}