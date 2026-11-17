import java.util.EmptyStackException;

public class CardStack {
    private Card[] stack;
    private int top = 0;

    public CardStack(int capacity) {
        stack = new Card[capacity];
    }

    public void push(Card card) {
        if (top == stack.length) {
            Card[] newStack = new Card[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[top++] = card;
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        Card poppedCard = stack[top];
        stack[top] = null;
        return poppedCard;
    }


    //dunno where to use ;-;
    public Card peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}