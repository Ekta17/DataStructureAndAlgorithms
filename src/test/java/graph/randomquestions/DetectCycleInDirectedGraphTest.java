package graph.randomquestions;

import graph.Graph;
import graph.TestHelper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetectCycleInDirectedGraphTest implements TestHelper {

	private static DetectCycleInDirectedGraph detectCycleInDirectedGraph;

	@BeforeAll
	public static void init(){
		detectCycleInDirectedGraph=new DetectCycleInDirectedGraph();
	}

	@Test
	void testIsGraphCyclicWhenCyclic() {
		Graph g = createDirectedCyclicGraph();
		assertTrue(detectCycleInDirectedGraph.isGraphCyclic(g));
	}


	@Test
	void testIsGraphCyclicWhenNotCyclic() {
		Graph g = createDirectedAcyclicGraph();
		assertFalse(detectCycleInDirectedGraph.isGraphCyclic(g));
	}
}