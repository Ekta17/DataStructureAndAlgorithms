package graph.traversal;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BreathFirstTraversalTest implements TestHelper {

	private static BreathFirstTraversal breathFirstTraversal;

	@BeforeAll
	public static void init() {
		breathFirstTraversal = new BreathFirstTraversal();
	}

	@Test
	public void testBFSTraversal() {
		Graph g = createUndirectedCyclicGraph();
		List<Integer> bfs = breathFirstTraversal.traverse(g);
		assertEquals(Arrays.asList(5, 3, 7, 0, 2, 9, 1), bfs);
	}

}