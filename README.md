# Task4-RandomCards

April 8, 2024

Deadline: Apr 19 (inclusive)  

## Task 4  

Invoking Math.random() returns a (pseudo)random number of type double from the half-open interval [0, 1). Use this generator to draw cards from a standard deck. First, draw an integer from the interval [1, 4] (corresponding to suit: clubs, diamonds, hearts, spades) and then another number from the interval [2, 14] (deuce, trey, four, five, . . . , ten, Jack, Queen, King, Ace). Using the switch expression, define strings describing cards and display five such random cards on the console. 

For example, the following program  

```java
public class Cards {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            /*
            * Define two integers using only Math.random():
            * col is a random integer from range [1, 4]
            * rnk is a random integer from range [2, 14]
            */

            String color = switch(col) {
                // ...
            };

            String rank = switch(rnk) {
                // ...
            };

            System.out.println(rank + " of " + color);
        }
    }
}
```

could print  
  
```
Five of Spades  
Queen of Clubs  
Seven of Diamonds  
Deuce of Hearts  
Eight of Hearts  
```

## Solution

[Replit](https://replit.com/@piecucci/Task4RandomCardsV2) V2 (without switch expression)

```java
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

```
