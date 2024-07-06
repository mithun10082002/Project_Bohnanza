//package BaseGame;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.ByteArrayInputStream;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import static org.junit.Assert.*;
//
//public class PhaseTest {
//
//    private Phase phase;
//    private Player testPlayer;
//
//    @Before
//    public void setUp() {
//        // Create a mock Scanner with predefined input for testing
//        String input = "1\nno\n"; // Simulates choosing Field 1 and answering 'no' for the second card
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
//        Scanner scanner = new Scanner(inputStream);
//
//        // Initialize Phase with mock Scanner and create a test player
//        phase = new Phase(scanner);
//        testPlayer = new Player("TestPlayer1");
//        testPlayer.addCardToHand(Cards.GARTENBOHNE);
//        testPlayer.addCardToHand(Cards.ROTEBOHNE);
//    }
//
//    @Test
//    public void testPlantBeanCardsFromHand() {
//        phase.plantBeanCardsFromHand(testPlayer);
//
//        // Assert that the first card (GartenBohne) is planted in Field 1
//        List<Cards> field1Cards = testPlayer.getField1().getCards();
//        assertEquals(1, field1Cards.size());
//        assertEquals(Cards.GARTENBOHNE, field1Cards.get(0));
//
//        // Assert that the second card (RoteBohne) is not planted because 'no' was chosen
//        List<Cards> hand = testPlayer.getHand();
//        assertEquals(1, hand.size());
//        assertEquals(Cards.ROTEBOHNE, hand.get(0));
//    }
//}
