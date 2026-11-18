import java.util.Random;
void main() {
    ArrayQueue queue = new ArrayQueue(5);
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    int gamesCreated = 0;
    int playerID = 1;

    System.out.println("Matcmaking");

    while (gamesCreated < 10) {
        int x = random.nextInt(7) + 1;

        System.out.println("Turn ending. " + x + " new players joined the queue!");

        for (int i = 0; i < x; i++) {
            Player newPlayer = new Player(playerID, "Player" + playerID, random.nextInt(100000) + 1);
            queue.add(newPlayer);
            playerID++;
        }


        System.out.println("Current Queue Size: " + queue.size());
        queue.printQueue();


        while (queue.size() >= 5) {
            gamesCreated++;
            System.out.println("\nmatch found game#" + gamesCreated + " with the first 5 players:");


            for (int i = 0; i < 5; i++) {
                Player matchedPlayer = queue.remove();
                System.out.println("  -> Dequeued: " + matchedPlayer);
            }

            System.out.println("Game #" + gamesCreated + " successfully created! Remaining in queue: " + queue.size());

            if (gamesCreated >= 10) {
                break;
            }
        }

        if (gamesCreated >= 10) {
            break;
        }

        System.out.print("\nPress Enter to proceed to the next turn");
        scanner.nextLine();
    }

    System.out.println("\n10 games done terminating");
}

