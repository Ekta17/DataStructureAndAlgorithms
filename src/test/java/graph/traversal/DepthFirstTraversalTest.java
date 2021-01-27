package graph.traversal;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DepthFirstTraversalTest implements TestHelper {

	private static DepthFirstTraversal depthFirstTraversal;

	@BeforeAll
	public static void init() {
		depthFirstTraversal = new DepthFirstTraversal();
	}

	@Test
	public void testDFSTraversal() {
		Graph g = createUndirectedCyclicGraph();
		List<Integer> dfs = depthFirstTraversal.traverse(g);
		assertEquals(Arrays.asList(0,1,2,3,4), dfs);
	}

}