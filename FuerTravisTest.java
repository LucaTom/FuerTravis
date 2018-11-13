import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuerTravisTest {

	@Test
	public void testaddieren() {
		FuerTravis test = new FuerTravis(); 
		int t = test.addieren(4,3);
		assertEquals (7, t);
	}
	@Test
	public void testdividieren() {
		FuerTravis test2 = new FuerTravis();
		double t = test2.dividieren(4, 2);
		assertEquals (2, t);
	}
	@Test
	public void testistGerade() {
		FuerTravis test3 = new FuerTravis();
		boolean t = test3.istGerade(5);
		assertEquals (false, t);
	}

}
