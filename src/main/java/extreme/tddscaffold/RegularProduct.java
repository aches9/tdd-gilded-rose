package extreme.tddscaffold;

public class RegularProduct extends Product implements GildedRose{
    public RegularProduct(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateProductQuality() {
        decreaseQuality();
        updateSellIn();
        if (isExpire()) {
            decreaseQuality();
        }
    }
}
