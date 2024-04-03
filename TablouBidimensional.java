import java.util.Scanner;

public class TablouBidimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți n: ");
        int n = scanner.nextInt();

        // Creem și initializam tabloul bidimensional
        int[][] tablou = new int[n][];

        // Construim tabloul
        for (int i = 0; i < n; i++) {
            tablou[i] = new int[i + 1]; // Fiecare linie are lungimea i+1
            for (int j = 0; j <= i; j++) {
                tablou[i][j] = j + 1; // Atribuim valorile de la 1 la i+1 pe fiecare linie
            }
        }

        // Afisam tabloul
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tablou[i].length; j++) {
                System.out.print(tablou[i][j] + " ");
            }
            System.out.println(); // Trecem la noua linie dupa fiecare linie afisata
        }

        // Lasam doua linii goale dupa afișarea tabloului
        System.out.println("\n");


        String mesajBinar = "01010000011011110111011101100101011100100110010101100100001000000110001001111001001000000100000101101110011001110110010101110010011101010010000001000110011011000110111101110010011010010110111000100000010001000110000101101110011010010110010101101100";
        String mesajText = fromBinaryString(mesajBinar);
        System.out.println(mesajText);
        scanner.close();
    }
    public static String fromBinaryString(String binary) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            int charCode = Integer.parseInt(binary.substring(i, i + 8), 2);
            text.append((char) charCode);
        }
        return text.toString();
    }
}
