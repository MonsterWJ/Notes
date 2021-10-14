package JZ18;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//递归
/*public class Solution {
    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) return null;
        TreeNode node = pRoot.left;
        pRoot.left = pRoot.right;
        pRoot.right = node;
        Mirror(pRoot.left);
        Mirror(pRoot.right);
        return pRoot;
    }
}*/
//BFS
/*public class Solution {
    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(pRoot);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode left = node.left;
            node.left = node.right;
            node.right = left;
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return pRoot;
    }
}*/

//DFS
public class Solution {
    public TreeNode Mirror(TreeNode root) {
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) stack.push(node.left);
            if (node.right != null) stack.push(node.right);
        }
        return root;
    }
}
