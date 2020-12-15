package Graph_DFSAndBFS;

class TreeNode{
	int val;
	TreeNode left, right;
	TreeNode(int x){
		this.val=x;
	}//TreeNode() END
}//TreeNode END

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		MaximumDepthOfBinaryTree a = new MaximumDepthOfBinaryTree();
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
//		root.left.left = new TreeNode(4);
//		root.left.right = new TreeNode(5);
//		//target: 3
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(7);
		root.right = new TreeNode(4);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(1);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(6);
		root.right.left.right = new TreeNode(5);
		root.right.left.right.left = new TreeNode(2);
		//target: 5
		
		System.out.println(a.solve(root));
	}//main() END

	private int solve(TreeNode root) {
		if(root==null) {return 0;}//if END
		
		int leftDepth = solve(root.left);
		int rightDepth = solve(root.right);
		
		return Math.max(leftDepth, rightDepth)+1;
	}//solve() END

}//MaximumDepthOfBinaryTree END
