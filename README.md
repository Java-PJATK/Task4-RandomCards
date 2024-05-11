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
