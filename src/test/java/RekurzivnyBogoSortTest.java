import org.junit.Assert;
import org.junit.Test;

public class RekurzivnyBogoSortTest {
    @Test
    public void test() throws Exception {
        int[] cisla = {20, 15, 17, 12, -10, 25};

        RekurzivnyBogoSort bogoSort = new RekurzivnyBogoSort();
        bogoSort.zotried(cisla);

        int[] ocakavanyVysledok = { -10, 12, 15, 17, 20, 25 };
        Assert.assertArrayEquals(ocakavanyVysledok, cisla);
    }

    @Test
    public void testVelaDat() throws Exception {
        int[] cisla = {20, 15, 17, 12, -10, 25, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        RekurzivnyBogoSort bogoSort = new RekurzivnyBogoSort();
        bogoSort.zotried(cisla);
//
//        int[] ocakavanyVysledok = { -10, 12, 15, 17, 20, 25 };
//        Assert.assertArrayEquals(ocakavanyVysledok, cisla);
    }
}