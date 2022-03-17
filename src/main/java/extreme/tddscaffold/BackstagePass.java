package extreme.tddscaffold;

public class BackstagePass extends Product implements GildedRose{
    private static final int BEFORE_SHOW_10_DAYS = 11;
    private static final int BEFORE_SHOW_5_DAYS = 6;
    private static final int ZERO_VALUE = 0;

    public BackstagePass(int sellIn, int quality) {
        super("Backstage Pass", sellIn, quality);
    }

    @Override
    public void updateProductQuality() {
        increaseQuality();
        if (sellIn < BEFORE_SHOW_10_DAYS) {
            increaseQuality();
        }
        if (sellIn < BEFORE_SHOW_5_DAYS) {
            increaseQuality();
        }
        updateSellIn();
        if (isExpire()) {
            quality = ZERO_VALUE;
        }
    }
}
