package extreme.tddscaffold;

public class Sulfuras extends Product implements GildedRose{
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras", sellIn, quality);
    }

    @Override
    public void updateProductQuality() {

    }
}
