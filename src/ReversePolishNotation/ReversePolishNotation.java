package ReversePolishNotation;

import java.util.Stack;

public class ReversePolishNotation {
    public static int evaluate(String[] array) {
        Stack<Integer> numberStack = new Stack<>();
        int result = 0;
        for (String s : array) {
            switch (s) {
                case "*":
                    int a = numberStack.pop();
                    int b = numberStack.pop();
                    result = a * b;
                    numberStack.push(result);
                    break;
                case "/" :
                    int c = numberStack.pop();
                    int d = numberStack.pop();
                    result = d / c;
                    numberStack.push(result);
                    break;
                    case "+" :
                    int e = numberStack.pop();
                    int f = numberStack.pop();
                    result = e + f;
                    numberStack.push(result);
                    break;
                    case "-" :
                    int g = numberStack.pop();
                    int h = numberStack.pop();
                    result = h - g;
                    numberStack.push(result);
                    break;


                default:
                    numberStack.push(Integer.parseInt(s));
            }

        }
        return numberStack.pop();

    }

    public static void main(String[] args) {
        String[] array={"4", "13", "5", "/", "+"};
        String[] array3={"2", "1", "+", "3", "*"};
        String[] array2={"1","5","6","*","*"};


        int evaluate = evaluate(array);
        System.out.println("evaluate = " + evaluate);
    }
}
