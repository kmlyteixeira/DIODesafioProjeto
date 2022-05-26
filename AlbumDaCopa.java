
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class AlbumDaCopa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        int[] albumFigurinhas = new int[numFigCompradas];

        for (int i = 0; i < numFigCompradas; i++) {
            int enterFig = scan.nextInt();

            if (enterFig != 0) {
                albumFigurinhas[i] = enterFig;
            }
        }

        for (int i = 0; i < numFigCompradas; i++) {
            int figurinha = albumFigurinhas[i];
            int repetida = 0;

            for (int j = 0; j < numFigCompradas; j++) {
                if (albumFigurinhas[j] == figurinha) {
                    repetida++;
                }
            }

            if (repetida >= 2) {
                for (int j = 0; j < numFigCompradas; j++) {
                    if (figurinha == albumFigurinhas[j]) {
                        albumFigurinhas[j] = -1;
                        break;
                    }
                }
            }
        }

        int figuras = 0;

        for (int i = 0; i < numFigCompradas; i++) {
            if (albumFigurinhas[i] != -1) {
                figuras++;
            }
        }

        int totFig = numTotal - figuras;

        System.out.println(totFig);

        scan.close();
    }
}