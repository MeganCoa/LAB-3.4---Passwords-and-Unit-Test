import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class passwordStorageTest {

	@Test
	void testBook() {
		boolean expected = true;
		boolean actual = passwordStorage.addPassword("BooK");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void testBOOK() {
		boolean expected = true;
		boolean actual = passwordStorage.addPassword("BOOK");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = true;
		boolean actual = passwordStorage.addPassword("BOOK6");
		assertEquals("You screwed up", expected, actual);
	}

}
