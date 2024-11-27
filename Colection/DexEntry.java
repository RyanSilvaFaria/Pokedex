package colection;

import java.util.Scanner;

public class DexEntry {
    
    private String DexEntry = null;

    public void AtribuirDexEntry(){

        Scanner scan = new Scanner ( System.in );
        DexEntry = scan.nextLine();

    }

    @Override
    public String toString() {
        return DexEntry;
    }
}
