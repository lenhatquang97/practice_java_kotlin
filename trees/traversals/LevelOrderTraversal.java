package traversals;
import java.util.*;
public class LevelOrderTraversal {
    Queue<TreeNode> q = new LinkedList<>();
    List<List<Integer>> ls = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return ls;
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> tmpLs = new ArrayList<>();
            int count = q.size();
            while(count > 0){
                TreeNode front = q.remove();
                tmpLs.add(front.val);
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
                count--;
            }
            ls.add(tmpLs);
        }
        return ls;
    }
}
