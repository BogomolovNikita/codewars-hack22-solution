import edu.hack22.solution.Catch22;
import edu.hack22.solution.Yossarian;
import org.junit.Test;

import static org.junit.Assert.fail;

@SuppressWarnings(value = "all")
public class DocDaneeka {
    @Test
    public void evaluate() throws Throwable {
        Yossarian yossarian = Catch22.loophole();
        if (!yossarian.isCrazy()) fail("Keep fighting!");
    }
}
