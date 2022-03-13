package extreme.tddscaffold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {
    private static Stream<TestData> regularProductTestData() {
        return Stream.of(
                new TestData("cola",10, 20, 9, 19),
                new TestData("butter",2, 0, 1, 0),
                new TestData("coffee",3, 6, 2, 5),
                new TestData("soap",0, 6, -1, 4),
                new TestData("bread",-1, 6, -2, 4)

        );
    }

    @ParameterizedTest
    @MethodSource("regularProductTestData")
    void should_sellIn_minus_1_quality_minus_1_when_update_given_normalProduct_sellInGT0_qualityGT0(TestData testData) {
        Product originProduct = new Product(testData.name, testData.sellIn, testData.quality);
        Product updatedProduct = new Product(testData.name, testData.updatedSellIn, testData.updatedQuality);
        GildedRose gildedRose = new GildedRose();
        Product updateResult = gildedRose.updateProduct(originProduct);
        Assertions.assertEquals(updatedProduct.toString(), updateResult.toString());
    }
}