package extreme.tddscaffold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegularProductTest {
    @Test
    void should_decrease_1_sellIn_and_decrease_1_quality_when_update_RegularProduct_given_sellIn_is_10_and_quality_is_20() {
        RegularProduct originRegularProduct = new RegularProduct("cola",10,20);
        originRegularProduct.updateProductQuality();
        RegularProduct newRegularProduct = new RegularProduct( "cola",9,19);
        Assertions.assertEquals(newRegularProduct.toString(), originRegularProduct.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_not_decrease_quality_when_update_RegularProduct_given_sellIn_is_2_and_quality_is_0() {
        RegularProduct originRegularProduct = new RegularProduct("butter",2,0);
        originRegularProduct.updateProductQuality();
        RegularProduct newRegularProduct = new RegularProduct( "butter",1,0);
        Assertions.assertEquals(newRegularProduct.toString(), originRegularProduct.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_decrease_1_quality_when_update_RegularProduct_given_sellIn_is_3_and_quality_is_6() {
        RegularProduct originRegularProduct = new RegularProduct("coffee",3,6);
        originRegularProduct.updateProductQuality();
        RegularProduct newRegularProduct = new RegularProduct( "coffee",2,5);
        Assertions.assertEquals(newRegularProduct.toString(), originRegularProduct.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_decrease_2_quality_when_update_RegularProduct_given_sellIn_is_0_and_quality_is_6() {
        RegularProduct originRegularProduct = new RegularProduct("soap",0,6);
        originRegularProduct.updateProductQuality();
        RegularProduct newRegularProduct = new RegularProduct( "soap",-1,4);
        Assertions.assertEquals(newRegularProduct.toString(), originRegularProduct.toString());
    }

    @Test
    void should_decrease_1_sellIn_and_decrease_2_quality_when_update_RegularProduct_given_sellIn_is_negative1_and_quality_is_6() {
        RegularProduct originRegularProduct = new RegularProduct("bread",-1,6);
        originRegularProduct.updateProductQuality();
        RegularProduct newRegularProduct = new RegularProduct( "bread",-2,4);
        Assertions.assertEquals(newRegularProduct.toString(), originRegularProduct.toString());
    }
}