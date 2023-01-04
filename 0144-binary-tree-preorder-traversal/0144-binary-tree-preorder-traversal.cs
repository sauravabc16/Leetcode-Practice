/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    
    
    public IList<int> PreorderTraversal(TreeNode root) {
        IList<int> list = new List<int>();
        if (root==null) return list;
        
        preOrder(root, list);
        return list;
    }
    public void preOrder(TreeNode root, IList<int> list){
        if(root == null ) return ;
        
        list.Add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
    
}