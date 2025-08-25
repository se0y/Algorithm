import java.util.*;

class Solution {
    boolean solution(String s) {
        // ( 이면 push, ) 이면 pop
        // pop 할 때 비어있는지 확인하기, 비어있으면 false
        // 최종적으로 스택에 남아있는 괄호 있으면 false
        
        Deque<Object> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        
        for (char c : arr) {
            if (c == '(') {
                stack.push(c);
            }
            if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) return false;
        
        return true;
    }
}