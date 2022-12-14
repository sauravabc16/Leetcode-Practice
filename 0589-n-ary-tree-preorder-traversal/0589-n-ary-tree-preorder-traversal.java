/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list= new ArrayList<>();
        if (root==null) return list;
        return preorderHelper(root, list);
    }
    
     public List<Integer> preorderHelper(Node root, List<Integer> list) {
         if(root.children.size() == 0){
             list.add(root.val);
             return list;
         }
         list.add(root.val);
         for(int i=0;i<root.children.size();i++){
             list=preorderHelper(root.children.get(i), list);
         }
         return list;
     }
}