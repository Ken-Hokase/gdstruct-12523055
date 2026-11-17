import java.util.Random;

    void main() {

        CardStack Deck = new CardStack(30);
        CardStack discardPile = new CardStack(30);
        CardStack playerHand = new CardStack(30);
        Random random = new Random();


        String[] possibleNames = {"Paradox", "Mina", "Drifter", "Victor", "Paige"};
        for (int i = 1; i <= 30; i++) {
            String randomName = possibleNames[random.nextInt(possibleNames.length)];
            Deck.push(new Card(randomName + " " + i));
        }

        System.out.println("Game Started");


        while (!Deck.isEmpty()) {

            int x = random.nextInt(4) + 2;
            System.out.println("\n[Round Status]");
            System.out.print("Player Hand (Current): \n");
            playerHand.printStack();
            System.out.println("Number of remaining cards in deck (ends when empty): " + Deck.size());
            System.out.println("Number of cards in the discarded pile: " + discardPile.size());
            System.out.println("\nWhat would you like to do?\nDraw " + x + " cards\nDiscard " + x + " cards\nGet " + x + " cards from the discard pile");
            Scanner scanner = new Scanner(System.in);
            int command = 0;

            if(playerHand.isEmpty())
            {
                if(!discardPile.isEmpty()) {
                    command = random.nextBoolean() ? 1 : 3;
                }
                else {
                    command = 1;

                }

            }

            else if(discardPile.isEmpty())
            {
                command = random.nextInt(2) + 1;
            }

            else {
                command = random.nextInt(3) + 1;
            }

            System.out.println("\n-----------------------------------------");

            if (command == 1) {
                System.out.println("Draw " + x + " card(s)");
                for (int i = 0; i < x; i++) {
                    if (Deck.isEmpty()) break;
                    playerHand.push(Deck.pop());
                }
            } else if (command == 2) {
                System.out.println("Discarded\n " + x + " card(s)");
                for (int i = 0; i < x; i++) {
                    if (playerHand.isEmpty()) break;
                    discardPile.push(playerHand.pop());
                }
            } else if (command == 3) {
                System.out.println("Get " + x + " card(s) from the discarded pile");
                for (int i = 0; i < x; i++) {
                    if (discardPile.isEmpty()) break;
                    playerHand.push(discardPile.pop());
                }
            }
            else
            {
                System.out.println("Command was not deemed possible");

            }

            // le pause
            if (!Deck.isEmpty()) {
                System.out.println("\nPress your enter key to continue");
                scanner.nextLine();
            }
        }

        System.out.println("\nDeck is empty. Game Over! ");

}

