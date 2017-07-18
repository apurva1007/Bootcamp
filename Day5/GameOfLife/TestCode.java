import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ruplaga on 7/17/2017.
 */
public class TestCode {
    @Test
    public void getCount() {
        int[][] board = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};
        Assert.assertEquals("expected is 2", 3, GameOfLife.getNeighboursCount(board, 0, 0, 3));
    }

    @Test
    public void getValue() {
        Assert.assertEquals("expected is 0", 0, GameOfLife.applyRules(4, 1));
    }

    @Test
    public void getIndex() {
        Assert.assertEquals("expected is 2", 2, GameOfLife.getIndex(-1, 3));
    }
}
