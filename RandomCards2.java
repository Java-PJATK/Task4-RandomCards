public class Cards {
    public static void main(String[] args) {
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] ranks = { "Deuce", "Trey", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
                "King", "Ace" };
        for (int i = 0; i < 5; ++i) {
            int col = (int) (Math.random() * 4);
            int rnk = (int) (Math.random() * 13);

            System.out.println(ranks[rnk] + " of " + suits[col]);
        }
    }

}
