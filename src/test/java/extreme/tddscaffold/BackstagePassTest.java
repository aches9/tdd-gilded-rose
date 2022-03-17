package extreme.tddscaffold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackstagePassTest {

    @Test
    void should_decrease_1_sellIn_and_increase_1_quality_when_update_BackstagePass_given_sellIn_is_15_and_quality_is_20() {
        BackstagePass originBackstagePass = new BackstagePass(15,20);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 14,21);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_2_quality_when_update_BackstagePass_given_sellIn_is_10_and_quality_is_45() {
        BackstagePass originBackstagePass = new BackstagePass(10,45);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 9,47);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_2_quality_when_update_BackstagePass_given_sellIn_is_9_and_quality_is_45() {
        BackstagePass originBackstagePass = new BackstagePass(9,45);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 8,47);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_1_quality_when_update_BackstagePass_given_sellIn_is_10_and_quality_is_49() {
        BackstagePass originBackstagePass = new BackstagePass(10,49);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 9,50);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_not_increase_quality_when_update_BackstagePass_given_sellIn_is_10_and_quality_is_50() {
        BackstagePass originBackstagePass = new BackstagePass(10,50);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 9,50);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_1_quality_when_update_BackstagePass_given_sellIn_is_5_and_quality_is_49() {
        BackstagePass originBackstagePass = new BackstagePass(5,49);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 4,50);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_3_quality_when_update_BackstagePass_given_sellIn_is_5_and_quality_is_45() {
        BackstagePass originBackstagePass = new BackstagePass(5,45);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 4,48);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_increase_3_quality_when_update_BackstagePass_given_sellIn_is_1_and_quality_is_20() {
        BackstagePass originBackstagePass = new BackstagePass(1,20);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( 0,23);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_quality_equal_0_when_update_BackstagePass_given_sellIn_is_0_and_quality_is_20() {
        BackstagePass originBackstagePass = new BackstagePass(0,20);
        originBackstagePass.updateProductQuality();
        BackstagePass newBackstagePass = new BackstagePass( -1,0);
        Assertions.assertEquals(newBackstagePass.toString(), originBackstagePass.toString());
    }
}