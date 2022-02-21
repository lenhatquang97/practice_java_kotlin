package traversals;
import java.util.*;

public class PreorderNoRecursion {
    List<Integer> ls = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return ls;
        st.add(root);
        while(!st.empty()){
            TreeNode tmp = st.pop();
            ls.add(tmp.val);
            if(tmp.right != null){
                st.add(tmp.right);
            }
            if(tmp.left != null){
                st.add(tmp.left);
            }
        }
        return ls;
    }
}
