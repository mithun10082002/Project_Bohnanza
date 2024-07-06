//package BaseGame;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Before;
//import org.junit.Test;
//import java.util.List;
//import static org.junit.Assert.*;
//
//public class PlayerTest {
//
//    private Player player;
//    private Cards gartenbohne;
//    private Cards rotebohne;
//
//    @Before
//    public void setUp() {
//        player = new Player("TestPlayer");
//        gartenbohne = Cards.GARTENBOHNE;
//        rotebohne = Cards.ROTEBOHNE;
//    }
//
//    @Test
//    public void testCardManagement() {
//        // Test adding cards to hand
//        player.addCardToHand(gartenbohne);
//        player.addCardToHand(rotebohne);
//
//        List<Cards> hand = player.getHand();
//
//        // Assertions
//        assertEquals(2, hand.size());
//        assertTrue(hand.contains(gartenbohne));
//        assertTrue(hand.contains(rotebohne));
//
//        // Test removing cards from hand
//        player.removeCardFromHand(gartenbohne);
//        hand = player.getHand();
//
//        // Assertions
//        assertEquals(1, hand.size());
//        assertFalse(hand.contains(gartenbohne));
//        assertTrue(hand.contains(rotebohne));
//    }
//
//    @Test
//    public void testFieldManagement() {
//        // Test planting card in field1
//        assertTrue(player.plantCardInField1(gartenbohne));
//
//        // Check field1 cards
//        List<Cards> field1Cards = player.getField1().getCards();
//
//        // Assertions
//        assertEquals(1, field1Cards.size());
//        assertTrue(field1Cards.contains(gartenbohne));
//
//        // Test planting card in field2
//        assertTrue(player.plantCardInField2(rotebohne));
//
//        // Check field2 cards
//        List<Cards> field2Cards = player.getField2().getCards();
//
//        // Assertions
//        assertEquals(1, field2Cards.size());
//        assertTrue(field2Cards.contains(rotebohne));
//    }
//}
