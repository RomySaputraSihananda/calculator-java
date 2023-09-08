import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        print("massukan angka pertama : ");
        int angka1 = input.nextInt();

        print("massukan operasi (+, -, *, /) : ");
        char choice = input.next().charAt(0);

        print("massukan angka kedua : ");
        int angka2 = input.nextInt();

        int[] hasil = calculate(angka1, angka2);

        switch (choice) {
            case '+':
                print("hasil = " + Integer.toString(hasil[0]));
                break;
            case '-':
                print("hasil = " + Integer.toString(hasil[1]));
                break;
            case '*':
                print("hasil = " + Integer.toString(hasil[2]));

                break;
            case '/':
                print("hasil = " + Integer.toString(hasil[3]));
                break;
            default:
                print("operasi salah");
                break;

        }
    }

    private static void print(String text) {
        System.out.print(text);
    }

    private static int[] calculate(int angka1, int angka2) {
        int[] hasil = {
                angka1 + angka2,
                angka1 - angka2,
                angka1 * angka2,
                angka1 / angka2,
        };
        return hasil;
    }
}
