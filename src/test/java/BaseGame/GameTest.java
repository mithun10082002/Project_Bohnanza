//package BaseGame;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class GameTest {
//
//    private List<Player> players;
//    private List<Cards> deck;
//
//    @Before
//    public void setUp() {
//        // Initialize the list of players
//        players = new ArrayList<>();
//        players.add(new Player("Player 1"));
//        players.add(new Player("Player 2"));
//        players.add(new Player("Player 3"));
//
//        // Initialize the deck
//        deck = new ArrayList<>();
//    }
//
//    @Test
//    public void testDetermineWinner() {
//        // Setup coins for each player
//        players.get(0).addCoins(3);
//        players.get(1).addCoins(5);
//        players.get(2).addCoins(2);
//
//        // Invoke determineWinner method
//        Player winner = determineWinner(players);
//
//        // Assertions
//        assertNotNull(winner);
//        assertEquals("Player 2", winner.getName());
//        assertEquals(5, winner.getCoins());
//    }
//
//    private Player determineWinner(List<Player> players) {
//        Player winner = null;
//        int maxCoins = 0;
//        for (Player player : players) {
//            if (player.getCoins() > maxCoins) {
//                maxCoins = player.getCoins();
//                winner = player;
//            }
//        }
//        return winner;
//    }
//
//    @Test
//    public void testReshuffleDeck() {
//        // Clear the deck to simulate an empty deck before reshuffling
//        deck.clear();
//
//        // Invoke reshuffleDeck method
//        reshuffleDeck(deck);
//
//        // Assertions
//        assertEquals(Cards.totalNumberOfCards(), deck.size()); // Total number of cards should match the sum of all card quantities
//
//        boolean containsAllCardTypes = true;
//        for (Cards card : Cards.values()) {
//            if (deck.stream().noneMatch(c -> c == card)) {
//                containsAllCardTypes = false;
//                break;
//            }
//        }
//        assertTrue(containsAllCardTypes);
//    }
//
//    private void reshuffleDeck(List<Cards> deck) {
//        for (Cards card : Cards.values()) {
//            for (int i = 0; i < card.showCardQuantity(); i++) {
//                deck.add(card);
//            }
//        }
//        Collections.shuffle(deck);
//    }
//}
