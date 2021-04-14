package isParenthesisMatch;

import java.util.Stack;

public class IsParenthesisMatch {

public static boolean isParenthesisMatch(String str)
{
	if (str.charAt(0) == '{')
        return false;

    Stack<Character> stack = new Stack<Character>();

    char c;
    for(int i=0; i < str.length(); i++) {
        c = str.charAt(i);

        if(c == '(')
            stack.push(c);
        
        else if(c == '{')
            stack.push(c);
        
        else if(c == '[')
            stack.push(c);
        
        else if(c == ')')
            if(stack.empty())
                return false;
            else if(stack.peek() == '(')
                stack.pop();
            else
                return false;
        
        else if(c == '}')
            if(stack.empty())
                return false;
            else if(stack.peek() == '{')
                stack.pop();
            else
                return false;
        
        else if(c == ']')
            if(stack.empty())
                return false;
            else if(stack.peek() == '[')
                stack.pop();
            else
                return false;
    }
    return stack.empty();
}
	

	public static void main(String[] args) {
		String str = "{}()";
		String str1 = "({()})";
		String str2 = "{}(";
		String str3 = "[]";
	
	    System.out.println(isParenthesisMatch(str));
	    System.out.println(isParenthesisMatch(str1));
	    System.out.println(isParenthesisMatch(str2));
	    System.out.println(isParenthesisMatch(str3));

	}

}
