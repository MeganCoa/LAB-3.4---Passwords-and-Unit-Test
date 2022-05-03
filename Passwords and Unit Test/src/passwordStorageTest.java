import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class passwordStorageTest {

	@Test
	void testBook() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BooK123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void testBOOK() {
		boolean expected = true;
		boolean actual = passwordStorage.addPassword("BOOK123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}
	@Test
	void test6() {
		boolean expected = false;
		boolean actual = passwordStorage.addPassword("BOOK6123");
		assertEquals("You screwed up", expected, actual);
	}

}
