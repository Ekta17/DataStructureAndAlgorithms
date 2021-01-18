package graph.search;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DepthFirstSearchTest implements TestHelper {

	private static DepthFirstSearch depthFirstSearch;

	@BeforeAll
	public static void init(){
		depthFirstSearch = new DepthFirstSearch();
	}

	@Test
	public void testDFSWhenKeyPresent(){
		Graph g = createGraph();
		assertTrue(depthFirstSearch.search(g, 1));
	}

	@Test
	public void testDFSWhenKeyNotPresent(){
		Graph g = createGraph();
		assertFalse(depthFirstSearch.search(g, 10));
	}

}