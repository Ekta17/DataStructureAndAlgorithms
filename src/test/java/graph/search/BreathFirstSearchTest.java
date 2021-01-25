package graph.search;

import graph.Graph;
import graph.TestHelper;
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
		Graph g = createUndirectedCyclicGraph();
		assertTrue(breathFirstSearch.search(g, 1));
	}

	@Test
	public void testBFSWhenKeyNotPresent() {
		Graph g = createUndirectedCyclicGraph();
		assertFalse(breathFirstSearch.search(g, 10));
	}
}