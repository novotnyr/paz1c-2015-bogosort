import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BogoSort {
    public int[] zotried(int[] cisla) {
        while (true) {
            System.out.println("Triedim..." + Arrays.toString(cisla));
            pomiesaj(cisla);
            if(jeUsporiadane(cisla)) {
                return cisla;
            }
        }
    }

    protected boolean jeUsporiadane(int[] cisla) {
        // skontrolujem, ci kazde dalsie cislo je > alebo = aktualnemu
        for (int i = 0; i < cisla.length - 1; i++) {
            if(cisla[i + 1] >= cisla[i]) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    protected void pomiesaj(int[] cisla) {
        List<Integer> zoznamCisiel = new LinkedList<Integer>();
        for (int cislo : cisla) {
            zoznamCisiel.add(cislo);
        }
        Collections.shuffle(zoznamCisiel);
        for (int i = 0; i < zoznamCisiel.size(); i++) {
            cisla[i] = zoznamCisiel.get(i);
        }
    }
}

