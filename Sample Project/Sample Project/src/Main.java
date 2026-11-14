//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
   //prints out hello world
    System.out.println(String.format("Hello and welcome!"));
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is you name?");
    String name = scanner.nextLine();

    System.out.println("Hello " + name);
    //This is a change
}
