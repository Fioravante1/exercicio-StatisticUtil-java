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
		return 0;
	}

	public static int median(int[] elements) {
		return 0;
	}
}