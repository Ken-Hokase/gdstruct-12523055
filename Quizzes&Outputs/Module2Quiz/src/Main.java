//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Player Asuna = new Player(1, "Asuna" , 100);
    Player Kirito = new Player(2, "Kirito" , 231);
    Player John = new Player(3, "John" , 413);

    PlayerLinkedList playerLinkedList = new PlayerLinkedList();

    playerLinkedList.addToFront(Asuna);
    playerLinkedList.addToFront(Kirito);
    playerLinkedList.addToFront(John);

    playerLinkedList.deleteFirstElement();




    playerLinkedList.printList();
}