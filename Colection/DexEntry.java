package Colection;

import java.util.Scanner;

public class DexEntry {

    private String DexEntry = null;

    public void AtualizarDexEntry() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nova dex Entry do pokemon");
        DexEntry = scan.nextLine();

    }

}