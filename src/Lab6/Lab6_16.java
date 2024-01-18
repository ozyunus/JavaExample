package Lab6;
public class Lab6_16 {

	public static void main(String[] args) {
        int[] dizi = {1, 2, -1, 2, 6, 7, 908, 9, 3, 4, 10};
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            boolean tekrarEdiyor = false;
            
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && eleman == dizi[j]) {
                    tekrarEdiyor = true;
                    break;
                }
            }
            if (!tekrarEdiyor) {
                System.out.print(eleman+" ");
            }
        }
	}
}

