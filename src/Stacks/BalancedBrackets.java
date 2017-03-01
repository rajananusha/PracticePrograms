package Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by anusha on 2/22/17.
 */
public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Stack st = new Stack();
        for(int i =0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if(current == '}' && st.isEmpty()|| current == ')' && st.isEmpty()||current == ']'&& st.isEmpty())
                return false;
            else if(current == '(' || current == '{' ||current == '[')
                st.push(current);
            else if(current == ')' && st.peek().toString().charAt(0) == '(')
                st.pop();
            else if(current == '}' && st.peek().toString().charAt(0) == '{')
                st.pop();
            else if(current == ']' && st.peek().toString().charAt(0) == '[')
                st.pop();
            else
                return false;
        }
        if (st.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
