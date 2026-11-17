//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    LinkedStack stack = new LinkedStack();

        stack.push(new Player(1, "FNS", 999));
        stack.push(new Player(2, "Jinggg", 1023));
        stack.push(new Player(3, "Subroza", 20));
        stack.push(new Player(4, "yay", 225));
        //stack.push(new Player(5, "f0rsaken", 342));

        stack.printStack();

        System.out.println("Popping: " + stack.peek());
        //stack.printStack();
}
