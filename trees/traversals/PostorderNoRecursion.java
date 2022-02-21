package traversals;
import java.util.*;
public class PostorderNoRecursion {
    Stack<TreeNode> st1=new Stack<>();
    Stack<TreeNode> st2=new Stack<>();
    List<Integer> ls=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return ls;
        st1.push(root);
        while(!st1.empty()){
            root = st1.pop();
            st2.add(root);
            if(root.left!=null)
                st1.push(root.left);
            if(root.right!=null)
                st1.push(root.right);
        }
        while(!st2.empty())
        {
            ls.add(st2.pop().val);
        }
        return ls;
    }
}
