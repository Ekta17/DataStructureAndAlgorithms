package trees.binarytree;

import java.util.List;

public class Util {

	int getHeightOfTree(Node root) {
		if (root == null)
			return 0;
		else
			return Math.max(getHeightOfTree(root.left), getHeightOfTree(root.right)) + 1;
	}

	//Get the nodes at distance k from the root
	// if k == 0 --> return root
	// else get all the nodes from the left and right subtree which are k distance from root.
	void collectNodesAtHeightK(Node root, int k, List<Integer> listOfNodes) {
		if (root == null)
			return ;
		if (k == 0) {
			listOfNodes.add(root.data);
		}else {
			collectNodesAtHeightK(root.left, k - 1, listOfNodes);
			collectNodesAtHeightK(root.right, k - 1, listOfNodes);
		}
	}
}
