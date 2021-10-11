package JZ59;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/*
public class utils.TreeNode {
    int val = 0;
    utils.TreeNode left = null;
    utils.TreeNode right = null;

    public utils.TreeNode(int val) {
        this.val = val;

    }

}
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null) {
            return result;
        }
        Stack<TreeNode> temp1 = new Stack<>();
        Stack<TreeNode> temp2 = new Stack<>();
        temp1.push(pRoot);
        while (!temp1.isEmpty() || !temp2.isEmpty()) {
            if (!temp1.isEmpty()) {
                ArrayList<Integer> list = new ArrayList<>();
                while (!temp1.isEmpty()) {
                    TreeNode node = temp1.pop();
                    list.add(node.val);
                    if (node.left != null) {
                        temp2.push(node.left);
                    }
                    if (node.right != null) {
                        temp2.push(node.right);
                    }
                }
                result.add(list);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                while (!temp2.isEmpty()) {
                    TreeNode node = temp2.pop();
                    list.add(node.val);
                    if (node.right != null) {
                        temp1.push(node.right);
                    }
                    if (node.left != null) {
                        temp1.push(node.left);
                    }
                }
                result.add(list);
            }
        }
        return result;
    }
}
