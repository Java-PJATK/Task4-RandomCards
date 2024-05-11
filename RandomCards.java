public class RandomCards {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            // Generate random integers for suit and rank
            int col = (int) (Math.random() * 4) + 1; // 1 to 4 (clubs, diamonds, hearts, spades)
            int rnk = (int) (Math.random() * 13) + 2; // 2 to 14 (deuce to Ace)

            // Define strings for suit and rank
            String color = switch (col) {
                case 1 -> "Clubs";
                case 2 -> "Diamonds";
                case 3 -> "Hearts";
                case 4 -> "Spades";
                default -> "Unknown";
            };

            String rank = switch (rnk) {
                case 2 -> "Deuce";
                case 3 -> "Trey";
                case 4, 5, 6, 7, 8, 9, 10 -> String.valueOf(rnk);
                case 11 -> "Jack";
                case 12 -> "Queen";
                case 13 -> "King";
                case 14 -> "Ace";
                default -> "Unknown";
            };

            System.out.println(rank + " of " + color);
        }
    }
}
