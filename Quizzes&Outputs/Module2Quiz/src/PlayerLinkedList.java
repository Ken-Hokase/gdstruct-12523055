public class PlayerLinkedList {
    private PlayerNode head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);

        if (head != null) {
            head.setPrevPlayer(playerNode);
        }

        head = playerNode;
        size++;

    }


    public void deleteFirstElement() {
        if (head != null)
        {
            head = head.getNextPlayer();
            head.setPrevPlayer(null);
            size--;
        }

    }


    public void printList()
    {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");

    }

    public int indexOf(Player target) {
        PlayerNode current = head;
        int index = 0;

        while (current != null) {
            if (current.getPlayer().equals(target)) {
                return index;
            }

            current = current.getNextPlayer();
            index++;
        }

        return -1;

    }

    public boolean contains(Player target) {
        return indexOf(target) != -1;
    }



}
