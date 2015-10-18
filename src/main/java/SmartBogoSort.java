import java.util.Random;

public class SmartBogoSort extends BogoSort {
    private Random random = new Random();

    @Override
    protected void pomiesaj(int[] cisla) {
        int index1 = random.nextInt(cisla.length);
        int index2 = random.nextInt(cisla.length);
        int temp = cisla[index1];
        cisla[index1] = cisla[index2];
        cisla[index2] = temp;

    }
}
