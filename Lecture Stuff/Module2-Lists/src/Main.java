//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Player> playerList = new ArrayList<>();

    playerList.add(new Player(1, "Asuna", 100));
    playerList.add(new Player(2, "Jett", 97));
    playerList.add(new Player(3, "Killua", 87));

    //retrieving a specific element
    // System.out.println(playerList.get(1));

    //to add an element to the array
    playerList.add(2, new Player(553, "sims", 55));

    //removing playes
    playerList.remove(2);

    //using contains to find specific elements
    System.out.println(playerList.contains(new Player(2, "Jett", 97)));

    System.out.println(playerList.indexOf(new Player(2, "Jett", 97)));


    //printing all players
    for (Player p  : playerList)
    {
        System.out.println(p);
    }

}
