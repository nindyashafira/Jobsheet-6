import java.util.Scanner;
public class Pemilihan2Percobaan222 {
    public static void main(String[] args) {
        Scanner input22 = new Scanner(System.in);
        int sudut1, sudut2, sudut3;
        double totalSudut;
        System.out.print("Masukkan sudut 1: ");
        sudut1 = input22.nextInt();
        System.out.print("Masukkan sudut 2: ");
        sudut2 = input22.nextInt();
        System.out.print("Masukkan sudut 3: ");
        sudut3 = input22.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
                else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        }else
        System.out.println("Bukan Segitiga");
    }
}
