package trees.binarytree.randomQuestions;

import trees.binarytree.TreeNode;

import java.util.List;

public class NodesAtKDistanceFromRoot {

	public void getNodesAtKDistanceFromRoot(TreeNode root, int k, List<Integer> nodesAtKDistance){
		if(root == null)
			return;
		if(k==0)
			nodesAtKDistance.add(root.val);
		else {
			getNodesAtKDistanceFromRoot(root.left, k - 1, nodesAtKDistance);
			getNodesAtKDistanceFromRoot(root.right, k - 1, nodesAtKDistance);
		}
	}
}
