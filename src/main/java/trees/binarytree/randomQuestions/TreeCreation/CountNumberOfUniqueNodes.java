package trees.binarytree.randomQuestions.TreeCreation;

import java.util.Map;

/**
 * Count number of unique value nodes in the longest path of the tree
 */
public class CountNumberOfUniqueNodes {

	public static int getNumberOfDistinctNodes (TreeNode T, Map<Integer, Integer> distinctNodesFrequency){
		if(T==null)
			return distinctNodesFrequency.size();

		if(distinctNodesFrequency.containsKey(T.val))
			return distinctNodesFrequency.size();
		else
			distinctNodesFrequency.put(T.val, 1);
		int count = 0;
		count = Math.max(getNumberOfDistinctNodes(T.left, distinctNodesFrequency), getNumberOfDistinctNodes(T.right, distinctNodesFrequency));

		return count;
	}
}
