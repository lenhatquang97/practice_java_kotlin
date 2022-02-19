import java.util.*;
public class EvaluateRPN {
    public boolean isOperator(String token){
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
    public int eval(int val1, String op, int val2){
        switch(op){
            case "+":
                return val1+val2;
            case "-":
                return val1-val2;
            case "*":
                return val1*val2;
            default:
                return val1/val2;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens){
            if(isOperator(token)){
                int val2 = st.pop();
                int val1 = st.pop();
                st.push(eval(val1,token,val2));
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}
