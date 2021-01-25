package graph.randomquestions;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCycleInUndirectedGraphTest implements TestHelper {
	private static DetectCycleInUndirectedGraph detectCycleInUndirectedGraph;

	@BeforeAll
	public static void init(){
		detectCycleInUndirectedGraph = new DetectCycleInUndirectedGraph();
	}

	@Test
	void testIsGraphCyclicWhenCyclic() {
		Graph g = createUndirectedCyclicGraph();
		assertTrue(detectCycleInUndirectedGraph.isGraphCyclic(g));
	}

	@Test
	void testIsGraphCyclicWhenNotCyclic() {
		Graph g = createUndirectedAcyclicGraph();
		assertFalse(detectCycleInUndirectedGraph.isGraphCyclic(g));
	}
}