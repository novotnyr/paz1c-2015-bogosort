import org.junit.Assert;
import org.junit.Test;

public class SmartBogoSortTest {
    @Test
    public void test() throws Exception {
        SmartBogoSort smartBogoSort = new SmartBogoSort();

        int[] cisla = {20, 15, 17, 12, -10, 25};

        smartBogoSort.zotried(cisla);

        int[] ocakavanyVysledok = { -10, 12, 15, 17, 20, 25 };
        Assert.assertArrayEquals(ocakavanyVysledok, cisla);
    }
}