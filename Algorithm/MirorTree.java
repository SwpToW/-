package Algorithm;
/*
 *  二叉树的镜像，递归
 */
public class MirorTree {
	//节点定义
	 public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	 }
	 //镜像入口函数
	 public void Mirror(TreeNode root) {
	        if(root==null)
	        	return;
	        change(root);
    }
	 //实际递归函数,临界条件是本节点的左右子树为空，因为空指针也可以进行互换操作
	 //先序遍历
	 private static void change(TreeNode root) {
		 TreeNode temp=null;
		 //左右子树都为空的时候叶子节点。
		 if(root!=null){
			 temp=root.left;
			 root.left=root.right;
			 root.right=temp; 
		 } if(root.left!=null){
		 change(root.left);	
		 } if(root.right!=null){
		 change(root.right);
		 }
	 }
}
