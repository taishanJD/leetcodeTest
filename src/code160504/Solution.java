package code160504;

import java.util.Stack;

/*
 * 2016.05.04
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * */
 class Solution {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int value) {
	while (!stack2.isEmpty()) {
	    stack1.push(stack2.pop());
	}
	stack1.push(value);
    }

    public int pop() {
	while (!stack1.isEmpty()) {
	    stack2.push(stack1.pop());
	}
	return stack2.pop();
    }
}
