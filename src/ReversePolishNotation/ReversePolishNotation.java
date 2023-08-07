package ReversePolishNotation;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluate(String[] array) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> operators = new Stack<>();
        int result = 0;
        for (String s : array) {
            switch (s) {
                case "*":
                    int a = numberStack.pop();
                    int b = numberStack.pop();
                    result = a * b;
                    numberStack.push(result);
                    break;
                default:
                    numberStack.push(Integer.parseInt(s));
            }


        }
        return numberStack.pop();

    }

    public static void main(String[] args) {
        String[] array={"1","5","6","*","*"};
        int evaluate = evaluate(array);
        System.out.println("evaluate = " + evaluate);
    }
}
