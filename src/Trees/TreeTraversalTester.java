package Trees;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by anusha on 11/2/16.
 */
public class TreeTraversalTester {

    public static List<Integer> inOrder(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return results;

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode p = stack.peek();
            if(p.left != null){
                stack.push(p.left);
                p.left=null;
            } else {
                results.add(p.val);
                stack.pop();
                if(p.right!=null){
                    stack.push(p.right);
                }
            }
        }

        return results;
    }

    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return results;

        stack.push(root);
        while(!stack.empty()){
            TreeNode p = stack.pop();
            results.add(p.val);
            if(p.right!=null){
                stack.push(p.right);
            }
            if(p.left != null){
                stack.push(p.left);
            }
        }
        return results;
    }

    public static List<Integer> postOrder(TreeNode root) {
        List<Integer> results = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null)
            return results;

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode p = stack.peek();
            if(p.left==null && p.right==null) {
                TreeNode pop = stack.pop();
                results.add(pop.val);
            } else {
                if (p.right != null) {
                    stack.push(p.right);
                    p.right=null;
                }
                if (p.left != null) {
                    stack.push(p.left);
                    p.left=null;
                }
            }
        }

        return results;
    }

    public static void main(String[] args){
        TreeNode mytree = new TreeNode(1);
        mytree.left = new TreeNode(2);
        mytree.right =new TreeNode(3);
        List<Integer> result1=inOrder(mytree);
        System.out.println(result1.toString());
        List<Integer> result2=postOrder(mytree);
        System.out.println(result2.toString());
        List<Integer> result3=preOrder(mytree);
        System.out.println(result3.toString());
    }

}
