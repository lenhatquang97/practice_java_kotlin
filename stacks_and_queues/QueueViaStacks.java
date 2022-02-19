import java.util.*;
public class QueueViaStacks {
    public Stack<Integer> st1;
    public Stack<Integer> st2;
    public QueueViaStacks() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        int res = st2.pop();
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        return res;
    }
    
    public int peek() {
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        int res = st2.peek();
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        return res;
    }
    
    public boolean empty() {
        return st1.empty() && st2.empty();
    }
}
