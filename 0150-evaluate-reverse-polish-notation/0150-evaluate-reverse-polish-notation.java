class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int b=stack.pop();
                int a=stack.pop();

                int res=evaluate(a,b,token);
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int evaluate(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; 
            default: return 0;
        }
        
    }
}