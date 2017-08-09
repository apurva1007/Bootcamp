import org.junit.Assert;
import org.junit.Test;



/**
 * Created by ruplaga on 7/17/2017.
 */
public class TicTacToeTest {
    @Test

    public void check() {
        int[][] boardPosition = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Assert.assertEquals("expected is 1", 1 , Board1.checkWinner(boardPosition, 3));
    }

}

