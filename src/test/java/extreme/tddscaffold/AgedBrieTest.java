package extreme.tddscaffold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AgedBrieTest {
    @Test
    void should_decrease_1_sellIn_and_increase_1_quality_when_update_AgedBrie_given_sellIn_is_2_and_quality_is_0() {
        AgedBrie originAgedBrie = new AgedBrie(2, 0);
        originAgedBrie.updateProductQuality();
        AgedBrie newAgedBrie = new AgedBrie(1,1);
        Assertions.assertEquals(newAgedBrie.toString(), originAgedBrie.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_1_quality_when_update_AgedBrie_given_sellIn_is_2_and_quality_is_49() {
        AgedBrie originAgedBrie = new AgedBrie(2, 49);
        originAgedBrie.updateProductQuality();
        AgedBrie newAgedBrie = new AgedBrie(1,50);
        Assertions.assertEquals(newAgedBrie.toString(), originAgedBrie.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_not_increase_quality_when_update_AgedBrie_given_sellIn_is_2_and_quality_is_50() {
        AgedBrie originAgedBrie = new AgedBrie(2, 50);
        originAgedBrie.updateProductQuality();
        AgedBrie newAgedBrie = new AgedBrie(1,50);
        Assertions.assertEquals(newAgedBrie.toString(), originAgedBrie.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_2_quality_when_update_AgedBrie_given_sellIn_is_0_and_quality_is_20() {
        AgedBrie originAgedBrie = new AgedBrie(0, 20);
        originAgedBrie.updateProductQuality();
        AgedBrie newAgedBrie = new AgedBrie( -1, 22);
        Assertions.assertEquals(newAgedBrie.toString(), originAgedBrie.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_2_quality_when_update_AgedBrie_given_sellIn_is_negative1_and_quality_is_20() {
        AgedBrie originAgedBrie = new AgedBrie(-1, 20);
        originAgedBrie.updateProductQuality();
        AgedBrie newAgedBrie = new AgedBrie( -2, 22);
        Assertions.assertEquals(newAgedBrie.toString(), originAgedBrie.toString());
    }


}