package extreme.tddscaffold;

public class RegulatProduct extends Product implements GildedRose{
    public RegulatProduct(String name, int sellIn, int quality) {
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
