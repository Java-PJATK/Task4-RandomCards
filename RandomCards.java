public class RandomCards {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            /*
             * Generate random numbers between 1 and 4 (inclusive) to represent the 4 suits.
             The Math.random() method returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
             By multiplying this value by 4 and casting it to an integer, we get a random integer between 0 and 3.
             Adding 1 shifts the range to be between 1 and 4.
             */
            int col = (int) (Math.random() * 4) + 1;
            int rnk = (int) (Math.random() * 13) + 2;

            String color;
            switch (col) {
                case 1:
                    color = "Clubs";
                    break;
                case 2:
                    color = "Diamonds";
                    break;
                case 3:
                    color = "Hearts";
                    break;
                case 4:
                    color = "Spades";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + col);
            }

            String rank;
            switch (rnk) {
                case 2:
                    rank = "Two";
                    break;
                case 3:
                    rank = "Three";
                    break;
                case 4:
                    rank = "Four";
                    break;
                case 5:
                    rank = "Five";
                    break;
                case 6:
                    rank = "Six";
                    break;
                case 7:
                    rank = "Seven";
                    break;
                case 8:
                    rank = "Eight";
                    break;
                case 9:
                    rank = "Nine";
                    break;
                case 10:
                    rank = "Ten";
                    break;
                case 11:
                    rank = "Jack";
                    break;
                case 12:
                    rank = "Queen";
                    break;
                case 13:
                    rank = "King";
                    break;
                case 14:
                    rank = "Ace";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + rnk);
            }

            System.out.println(rank + " of " + color);
        }
    }
}
