package Graph_DFSAndBFS;

import java.util.Stack;

//class TreeNode{
//	int val;
//	TreeNode left, right;
//	TreeNode(int x){
//		this.val=x;
//	}//TreeNode() END
//}//TreeNode END   //MaximumDepthOfBinaryTree에서 이미 정의함 

public class MaximumDepthOfBinaryTree_DFS {

	public static void main(String[] args) {
		MaximumDepthOfBinaryTree_DFS a = new MaximumDepthOfBinaryTree_DFS();
//		TreeNode node = new TreeNode(1);
//		node.left = new TreeNode(2);
//		node.right = new TreeNode(3);
//		node.left.left = new TreeNode(4);
//		node.left.right = new TreeNode(5);
//		//target: 3
		
		TreeNode node = new TreeNode(3);
		node.left = new TreeNode(7);
		node.right = new TreeNode(4);
		node.left.left = new TreeNode(8);
		node.left.right = new TreeNode(1);
		node.right.left = new TreeNode(9);
		node.right.right = new TreeNode(6);
		node.right.left.right = new TreeNode(5);
		node.right.left.right.left = new TreeNode(2);
		//target: 5
		
		System.out.println("val: "+a.solve(node));
	}//main()END

	private int solve(TreeNode node) {
		int result = 0;
		if(node==null) {return result;}//if END
		
		Stack<TreeNode> TNs = new Stack<TreeNode>();
		Stack<Integer> cnt = new Stack<Integer>();
		TNs.push(node);
		cnt.push(1);
		
		while(!TNs.isEmpty()) {
			TreeNode TN = TNs.pop();
			int count = cnt.pop();
			result = Math.max(result, count);
			
			if(TN.left!=null) {
				TNs.push(TN.left);
				cnt.push(count+1);
			}//if END
			if(TN.right!=null) {
				TNs.push(TN.right);
				cnt.push(count+1);
			}//if END
		}//while END
		
		return result;
	}//solve() END

}//MaximumDepthOfBinaryTree_DFS END
