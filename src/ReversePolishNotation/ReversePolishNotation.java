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
            }


        }


    }
}
