public class CetakGambar {
    public static void main(String[] args) {
        System.out.println("--- Panjang ---");
        cetakGambar(5, 5);

    }

    public static void cetakGambar(int panjang, int lebar) {
        if (panjang % 2 == 1 && lebar % 2 == 1) {
            for (int i = 1; i <= lebar; i++) {
                for (int j = 1; j <= panjang; j++) {
                    if (j == 1 || j == (panjang) || i == (lebar / 2) + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("=");
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Panjang dan lebar harus ganjil");
        }
    }
}
