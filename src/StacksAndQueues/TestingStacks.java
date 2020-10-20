package StacksAndQueues;

import java.util.Stack;

public class TestingStacks {
    public static void main(String[] args) {
        //Stack is an ordered list of objects inserted and removed
        //following a last in first out policy
        //Insert items with push() and delete items with pop()
        //Great for reversing things, pushing character from string into a stack, as we pop and
        //create a resulting string, the new string has the reversed characters of the original string

        Stack<String> deckOfCards = new Stack<>();
        String card1 = "Jack : Diamonds";
        String card2 = "8: Hearts";
        String card3 = "3 : Clubs";

        deckOfCards.push(card1);
        deckOfCards.push(card2);
        deckOfCards.push(card3);

        System.out.println(deckOfCards);

        String topOfDeck = deckOfCards.peek(); //basically looking at top of stack or the last item added
        System.out.println(topOfDeck);

        deckOfCards.pop();
        System.out.println(deckOfCards);

        while (!deckOfCards.isEmpty()) {
            String removedItem = deckOfCards.pop();
            System.out.println("Removed item is " + removedItem);
            System.out.println(deckOfCards);
        }
    }
}
