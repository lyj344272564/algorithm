package com.richard.sfjclx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * 3302. 表达式求值
 */
public class AC3302 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        Calculator calculator = new Calculator(str);
        System.out.println(calculator.eval());
        scanner.close();
    }

    // 计算中缀表达式
    static class Calculator {
        String expression; // 表达式字符串
        Stack<Integer> nums; // 存储操作符的栈
        Stack<Character> op; // 存储操作数的栈
        Map<Character, Integer> priority;// 操作符的优先级

        /**
         * @param expression
         */
        public Calculator(String expression) {
            this.expression = expression;
            nums = new Stack<>();
            op = new Stack<>();
            priority = new HashMap<>();
            priority.put('+', 1);
            priority.put('-', 1);
            priority.put('*', 2);
            priority.put('/', 2);
        }

        // 向外暴露的方法，计算表达式，并将结果返回
        public int eval() {
            for (int i = 0; i < expression.length(); i++) {
                char cur = expression.charAt(i);
                if (Character.isDigit(cur)) {
                    // 若当前字符是数字的话。需要将这个数从字符串中抠出来
                    int x = 0, j = i;
                    while (j < expression.length() && Character.isDigit(expression.charAt(j))) {
                        x = x * 10 + expression.charAt(j++) - '0';
                    }
                    i = j - 1;
                    // 将所有的操作数压入nums中
                    nums.push(x);
                }
                // 碰见右括号直接压入
                else if (cur == '(')
                    op.push(cur);
                else if (cur == ')') {
                    // 碰见左括号。计算两个括号之间的表达式
                    while (op.peek() != '(')
                        calculate();
                    //括号中的表达式求完了，将'('弹出
                    op.pop();
                } else {
                    // 遇到一个操作符,若他的优先级比栈顶的优先级小，那么先将栈顶的那个操作符运算了
                    while (!op.isEmpty() && op.peek() != '(' && priority.get(op.peek()) >= priority.get(cur))
                        calculate();
                    // 然后再将他压入栈中
                    op.push(cur);
                }
            }
            // 将所有的运算符操作
            while (!op.isEmpty())
                calculate();
            // 所有的运算符处理完后，nums中就只剩下最后的运算结果了
            return this.nums.peek();
        }

        //内部方法，用于计算栈顶两个操作数的结果，在将结果压入nums栈中
        private void calculate() {
            int b = nums.pop();
            int a = nums.pop();
            char c = op.pop();
            int res;
            if (c == '+')
                res = a + b;
            else if (c == '-')
                res = a - b;
            else if (c == '*')
                res = a * b;
            else
                res = a / b;
            nums.push(res);
        }

    }
}
