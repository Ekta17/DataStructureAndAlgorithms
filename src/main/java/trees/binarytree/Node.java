package trees.binarytree;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
