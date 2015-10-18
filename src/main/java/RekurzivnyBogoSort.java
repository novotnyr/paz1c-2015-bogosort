import java.util.Arrays;

public class RekurzivnyBogoSort extends BogoSort {
    @Override
    public int[] zotried(int[] cisla) {
        System.out.println("Triedim... " + Arrays.toString(cisla));

        if(jeUsporiadane(cisla)) {
            return cisla;
        }
        pomiesaj(cisla);
        return zotried(cisla);
    }
}
