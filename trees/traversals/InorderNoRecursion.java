package traversals;

import java.util.*;

public class InorderNoRecursion {
    List<Integer> ls = new ArrayList<>();
    Stack<TreeNode> st = new Stack<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null)
            return ls;
        TreeNode tmp = root;
        st.add(tmp);
        while (!st.empty()) {
            while (tmp != null && tmp.left != null) {
                st.add(tmp.left);
                tmp = tmp.left;
            }
            tmp = st.pop();
            if (tmp.right != null) {
                ls.add(tmp.val);
            } else {
                ls.add(tmp.val);
                tmp = null;
            }
            if (tmp != null && tmp.right != null) {
                st.add(tmp.right);
                tmp = tmp.right;
            }
        }
        return ls;
    }
}
