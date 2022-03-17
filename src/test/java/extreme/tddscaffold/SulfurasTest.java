package extreme.tddscaffold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SulfurasTest {
    @Test
    void should_do_nothing_when_update_Sulfuras_given_sellIn_is_0_and_quality_is_45() {
        Sulfuras originSulfuras = new Sulfuras(0,45);
        originSulfuras.updateProductQuality();
        Sulfuras newSulfuras = new Sulfuras( 0,45);
        Assertions.assertEquals(newSulfuras.toString(), originSulfuras.toString());
    }

    @Test
    void should_do_nothing_when_update_Sulfuras_given_sellIn_is_negative1_and_quality_is_45() {
        Sulfuras originSulfuras = new Sulfuras(-1,45);
        originSulfuras.updateProductQuality();
        Sulfuras newSulfuras = new Sulfuras( -1,45);
        Assertions.assertEquals(newSulfuras.toString(), originSulfuras.toString());
    }

    @Test
    void should_do_nothing_when_update_Sulfuras_given_sellIn_is_negative1_and_quality_is_50() {
        Sulfuras originSulfuras = new Sulfuras(-1,50);
        originSulfuras.updateProductQuality();
        Sulfuras newSulfuras = new Sulfuras( -1,50);
        Assertions.assertEquals(newSulfuras.toString(), originSulfuras.toString());
    }

    @Test
    void should_do_nothing_when_update_Sulfuras_given_sellIn_is_negative1_and_quality_is_1() {
        Sulfuras originSulfuras = new Sulfuras(-1,1);
        originSulfuras.updateProductQuality();
        Sulfuras newSulfuras = new Sulfuras( -1,1);
        Assertions.assertEquals(newSulfuras.toString(), originSulfuras.toString());
    }

    @Test
    void should_do_nothing_when_update_Sulfuras_given_sellIn_is_negative2_and_quality_is_1() {
        Sulfuras originSulfuras = new Sulfuras(-2,1);
        originSulfuras.updateProductQuality();
        Sulfuras newSulfuras = new Sulfuras( -2,1);
        Assertions.assertEquals(newSulfuras.toString(), originSulfuras.toString());
    }
}