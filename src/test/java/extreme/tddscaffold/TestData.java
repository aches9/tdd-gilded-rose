package extreme.tddscaffold;

public class TestData {
    public String name;
    public int sellIn;
    public int quality;
    public int updatedSellIn;
    public int updatedQuality;

    public TestData(String name, int sellIn, int quality, int updatedSellIn, int updatedQuality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.updatedSellIn = updatedSellIn;
        this.updatedQuality = updatedQuality;
    }

    public TestData() {
    }
}
