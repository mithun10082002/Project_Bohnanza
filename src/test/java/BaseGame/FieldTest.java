//package BaseGame;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.List;
//
//public class FieldTest {
//
//    private Field field;
//    private Cards gartenbohne;
//    private Cards rotebohne;
//
//    @Before
//    public void setUp() {
//        field = new Field();
//        gartenbohne = Cards.GARTENBOHNE;
//        rotebohne = Cards.ROTEBOHNE;
//    }
//
//    @Test
//    public void testPlantCard() {
//        // Plant a Gartenbohne card in an empty field
//        field.plantCard(gartenbohne);
//        List<Cards> cards = field.getCards();
//
//        // Assertions
//        assertEquals(1, cards.size());
//        assertEquals(gartenbohne, cards.get(0));
//
//        // Attempt to plant the same type of card
//        field.plantCard(gartenbohne);
//        cards = field.getCards();
//
//        // Assertions
//        assertEquals(2, cards.size());
//        assertEquals(gartenbohne, cards.get(1));
//
//        // Attempt to plant a different type of card
//        field.plantCard(rotebohne);
//        cards = field.getCards();
//
//        // Assertions
//        assertEquals(2, cards.size()); // Should not plant the different type of card
//    }
//
//    @Test
//    public void testCanPlantCard() {
//        // Can plant any card in an empty field
//        assertTrue(field.canPlantCard(gartenbohne));
//        assertTrue(field.canPlantCard(rotebohne));
//
//        // Plant a Gartenbohne card
//        field.plantCard(gartenbohne);
//
//        // Can plant the same type of card
//        assertTrue(field.canPlantCard(gartenbohne));
//
//        // Cannot plant a different type of card
//        assertFalse(field.canPlantCard(rotebohne));
//    }
//}
