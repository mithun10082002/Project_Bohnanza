package BaseGame;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CardsTest {

    @Test
    public void testGetCardByName() {
        // Test valid card name
        Cards gartenbohne = Cards.getCardByName("GartenBohne");
        assertNotNull(gartenbohne);
        assertEquals("GartenBohne", gartenbohne.showCardName());

        // Test invalid card name
        Cards invalidCard = Cards.getCardByName("InvalidCard");
        assertNull(invalidCard);
    }

    @Test
    public void testGetRandomCard() {
        // Generate a set to store unique random cards
        Set<Cards> randomCards = new HashSet<>();

        // Get 100 random cards (should be mostly unique due to randomness)
        for (int i = 0; i < 100; i++) {
            Cards randomCard = Cards.getRandomCard();
            randomCards.add(randomCard);
        }

        // Assert that at least more than half of the cards were chosen
        assertTrue(randomCards.size() > Cards.values().length / 2);
    }
}
