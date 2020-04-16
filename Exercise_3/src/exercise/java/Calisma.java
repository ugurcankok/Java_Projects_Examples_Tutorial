package deneme3.java;
import java.util.Arrays;

public class Calisma {
	
	public static int[] getDizi() {
	    return new int[]{1, 2, 3, 4, 5};
	}

	
	public static int getIlkEleman(int[] dizi) {
	    return dizi[0];
	}

	public static int getOrtanca(int[] dizi) {

	    double doubleYarim = (dizi.length / 2.0);

	    int tamSayiYarim = (dizi.length / 2);

	    Arrays.sort(dizi);

	   
	    int indis = 0;
	    if (doubleYarim > tamSayiYarim) {
	        indis = tamSayiYarim + 1;
	    } else {
	        indis = tamSayiYarim;
	    }

	    return dizi[indis];
	}

	
	public static int getSonEleman(int[] dizi) {
	    return dizi[dizi.length];
	}

	public static void printDizi(int[] dizi) {
	    for (int i : dizi) {
	        System.out.println(i);
	    }
	}

	public static int[] copy(int[] dizi) {
	    int[] _copy = Arrays.copyOf(dizi, dizi.length);
	    return _copy;
	}

	public static void reverse(int[] dizi) {

	    for (int i = 0; i < dizi.length / 2; i++) {
	        dizi[i] = dizi[dizi.length - i];
	    }
	    
	}

	public static void doubleValue(int[] dizi) {
	    for (int i = 0; i < dizi.length; i++) {
	        dizi[i] = dizi[i] * 2;
	    }
	}

	public static void printAltDizi(int[] dizi, int idx, int len) {
	    for (int i = idx; i <= len; i++) {
	        System.out.println(dizi[i]);
	    }
	}


	public static void printIlkUc(int[] dizi) {
	    printAltDizi(dizi, 0, 3);
	}

	public static void printSonkUc(int[] dizi) {

	    int idx = (dizi.length - 1) - 3;
	    printAltDizi(dizi, idx, 3);
	}

	public static int getToplam(int[] dizi) {
	    int toplam = 0;

	    
	    for (int item : dizi) {
	        toplam = toplam + item;
	    }

	    return toplam;
	}

	public static double getOrtalama(int[] dizi) {
	    double toplam = getToplam(dizi); 

	    return toplam / dizi.length;
	}


	public static double getMin(int[] dizi) {

	    int[] _copy = copy(dizi);

	    Arrays.sort(dizi);
	    return dizi[0];
	}

	public static double getMax(int[] dizi) {
	    int[] _copy = copy(dizi);

	    Arrays.sort(dizi);
	    return dizi[dizi.length - 1];
	}

	public static void printBuyukOrtalama(int[] dizi) {
	    double ort = getOrtalama(dizi);
	    for (int item : dizi) {

	        if (item > ort) {
	            System.out.println(item);
	        }

	    }
	}

	public static void printKucukOrtalama(int[] dizi) {
	    double ort = getOrtalama(dizi);
	    for (int item : dizi) {

	        if (item < ort) {
	            System.out.println(item);
	        }

	    }
	}

	public static int[] getAltDizi(int[] dizi, int begin, int length) {
	    int[] altDizi = new int[length];
	    int j = 0;
	    for (int i = begin; i < length; i++) {
	        altDizi[j] = dizi[i];
	        j++;
	    }

	    
	    return altDizi;
	}

	public static int[] getDizi32(int[] dizi) {
	    return getAltDizi(dizi, 3, 2);
	}
	

	public static void main(String[] args) {
		
		int [] dizi=Calisma.getDizi();
		Calisma.reverse(dizi);
		System.out.println(getIlkEleman(dizi));
		System.out.println(getOrtanca(dizi));
		printDizi(dizi);
		System.out.println(getOrtanca(dizi));
		System.out.println(copy(dizi));
		System.out.println(getToplam(dizi));
		reverse(dizi);
		System.out.println(getMin(dizi));
		

	}

}
