package extreme.tddscaffold;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


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

    private static Stream<TestData> AgedBrieTestData() {
        return Stream.of(
                new TestData("Aged Brie", 2, 0, 1, 1),
                new TestData("Aged Brie",2, 49, 1, 50),
                new TestData("Aged Brie",2, 50, 1, 50),
                new TestData("Aged Brie",0, 20, -1, 22),
                new TestData("Aged Brie",-1, 20, -2, 22)
        );
    }

    private static Stream<TestData> sulfurasTestData() {
        return Stream.of(
                new TestData("Sulfuras", 0, 45, 0, 45),
                new TestData("Sulfuras",-1, 45, -1, 45),
                new TestData("Sulfuras",-1, 50, -1, 50),
                new TestData("Sulfuras",-1, 1, -1, 1),
                new TestData("Sulfuras",-2, 1, -2, 1)
        );
    }

    private static Stream<TestData> backstagePassTestData() {
        return Stream.of(
                new TestData("Backstage Pass",15,20, 14,21),
                new TestData("Backstage Pass",10,45, 9, 47),
                new TestData("Backstage Pass",9, 45, 8, 47),
                new TestData("Backstage Pass",10,49, 9, 50),
                new TestData("Backstage Pass",10,50, 9, 50),
                new TestData("Backstage Pass",5, 49, 4, 50),
                new TestData("Backstage Pass",5, 45, 4, 48),
                new TestData("Backstage Pass",1, 20, 0, 23),
                new TestData("Backstage Pass",0, 20, -1,0)
        );
    }

    @ParameterizedTest
    @MethodSource("regularProductTestData")
    void should_update_sellIn_and_Quality_when_update_given_regularProduct(TestData testData) {
        Product originProduct = new Product(testData.name, testData.sellIn, testData.quality);
        Product updatedProduct = new Product(testData.name, testData.updatedSellIn, testData.updatedQuality);
        GildedRose gildedRose = new GildedRose();
        Product updateResult = gildedRose.updateProduct(originProduct);
        Assertions.assertEquals(updatedProduct.toString(), updateResult.toString());
    }

    @ParameterizedTest
    @MethodSource("AgedBrieTestData")
    void should_update_sellIn_and_Quality_when_update_given_agedBrie(TestData testData) {
        Product originProduct = new Product(testData.name, testData.sellIn, testData.quality);
        Product updatedProduct = new Product(testData.name, testData.updatedSellIn, testData.updatedQuality);
        GildedRose gildedRose = new GildedRose();
        Product updateResult = gildedRose.updateProduct(originProduct);
        Assertions.assertEquals(updatedProduct.toString(), updateResult.toString());
    }

    @ParameterizedTest
    @MethodSource("sulfurasTestData")
    void should_update_sellIn_and_Quality_when_update_given_sulfuras(TestData testData) {
        Product originProduct = new Product(testData.name, testData.sellIn, testData.quality);
        Product updatedProduct = new Product(testData.name, testData.updatedSellIn, testData.updatedQuality);
        GildedRose gildedRose = new GildedRose();
        Product updateResult = gildedRose.updateProduct(originProduct);
        Assertions.assertEquals(updatedProduct.toString(), updateResult.toString());
    }

    @ParameterizedTest
    @MethodSource("backstagePassTestData")
    void should_update_sellIn_and_Quality_when_update_given_backstagePass(TestData testData) {
        Product originProduct = new Product(testData.name, testData.sellIn, testData.quality);
        Product updatedProduct = new Product(testData.name, testData.updatedSellIn, testData.updatedQuality);
        GildedRose gildedRose = new GildedRose();
        Product updateResult = gildedRose.updateProduct(originProduct);
        Assertions.assertEquals(updatedProduct.toString(), updateResult.toString());
    }
}