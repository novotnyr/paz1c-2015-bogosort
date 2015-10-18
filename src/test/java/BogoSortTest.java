import org.junit.Assert;

public class BogoSortTest {
    @org.junit.Test
    public void test() throws Exception {
        int[] cisla = {20, 15, 17, 12, -10, 25};

        BogoSort bogoSort = new BogoSort();
        bogoSort.zotried(cisla);

        int[] ocakavanyVysledok = { -10, 12, 15, 17, 20, 25 };
        Assert.assertArrayEquals(ocakavanyVysledok, cisla);
    }
}