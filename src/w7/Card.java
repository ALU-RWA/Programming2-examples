package w7;

public class Card {
    // Start with your fields
    String value;
    String suit;

    // Define your constructor

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    // Create all the methods from the instructions.

    public String toString(){
        return value + " of " + suit;
    }

    public boolean equals(Card otherCard){
        return this.suit.equals(otherCard.suit) && this.value.equals(otherCard.value);
    }

    // You should comment out each few lines in main as you make progress, this will help
    // you test that your work is correct.

    public static void main(String[] args) {
        Card ace1 = new Card("Ace", "Hearts");
        Card ace2 = new Card("Ace", "Clubs");

        // This should display " Ace of hearts"
        System.out.println(ace1);
        // This should display " Ace of Clubs"
        System.out.println(ace2);

        Card ace3 = new Card("Ace", "Clubs");
        // This should display True
        System.out.println(ace2.equals(ace3));

        // This should display False
        System.out.println(ace1.equals(ace3));
    }
}
