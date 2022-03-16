package extreme.tddscaffold;

public class AgedBrie extends Product implements GildedRose{

    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    public void updateProductQuality() {
        increaseQuality();
        updateSellIn();
        if (isExpire()) {
            increaseQuality();
        }
    }
}
