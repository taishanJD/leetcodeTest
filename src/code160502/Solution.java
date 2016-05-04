package code160502;

/*
 * 2016.05.02
 * 给定某二叉树的前序和中序遍历，重建该二叉树
 * */
 class Solution {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
	TreeNode root = reConstructBinaryTree(pre, 0, pre.length - 1, in, 0,
		in.length - 1);
	return root;
    }

    private TreeNode reConstructBinaryTree(int[] pre, int startPre, int endPre,
	    int[] in, int startIn, int endIn) {
	// TODO Auto-generated method stub
	if (startPre > endPre || startIn > endIn) {
	    return null;
	}
	TreeNode root = new TreeNode(startPre);
	for (int i = startIn; i <= endIn; i++) {
	    if (in[i] == pre[startPre]) {
		root.left = reConstructBinaryTree(pre, startPre + 1, startPre
			+ i - startIn, in, startIn, i - 1);
		root.right = reConstructBinaryTree(pre, i - startIn + startPre
			+ 1, endPre, in, i + 1, endIn);
	    }
	}
	return root;
    }
}
