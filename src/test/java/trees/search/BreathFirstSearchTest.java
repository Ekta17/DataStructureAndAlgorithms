package trees.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BreathFirstSearchTest implements TestHelper {

	private static BreathFirstSearch breathFirstSearch;

	@BeforeAll
	public static void init() {
		breathFirstSearch = new BreathFirstSearch();
	}

	@Test
	public void testBFSWhenKeyPresent() {
		Graph g = createGraph();
		assertTrue(breathFirstSearch.search(g, 1));
	}

	@Test
	public void testBFSWhenKeyNotPresent() {
		Graph g = createGraph();
		assertFalse(breathFirstSearch.search(g, 10));
	}
}