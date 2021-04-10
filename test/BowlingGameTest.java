import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BowlingGameTest {

	protected Game g;
	@Before
	public void setUp() {
		g = new Game();
	}
	
	@Test
	public void testGutterGame() {
		rollMany(20,0);
		
		assertEquals(0,g.score());
	}
	@Ignore("until we walk frame by frame")
	@Test
	public void testAllOnes() {
		g.roll(5);
		g.roll(5);
		g.roll(3);
		rollMany(17, 0);
		
		assertEquals(16,g.score());
	}

	protected void rollMany(int n, int pins) {
		for(int i=0;i<n;i++) {
			g.roll(pins);
		}
	}
}
