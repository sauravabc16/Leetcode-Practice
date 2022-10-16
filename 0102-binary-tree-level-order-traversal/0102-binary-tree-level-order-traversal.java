/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        return levelOrder(root, list, 0);
    }
    public List<List<Integer>> levelOrder(TreeNode root, List<List<Integer>> list, int level){
        
        if(root==null){
            return list;
        }
        
        if(list.size()-1  < level ){
            List<Integer> child = new ArrayList<>();
            child.add(root.val);
            list.add(child);
        }
        else{
            list.get(level).add(root.val);
        }
        
        list = levelOrder(root.left, list, level+1);
        list = levelOrder(root.right, list, level+1);
//         if(root.left!=null)
//             list = levelOrder(root.left, list, level+1);
        
//         if(root.right!=null)
//             list = levelOrder(root.right, list, level+1);
        
        return list;
        
    }
}