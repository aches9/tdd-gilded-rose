package extreme.tddscaffold;

public abstract class Product {
    public String name;
    public int sellIn;
    public int quality;
    private static final int MAX_QUALITY = 50;
    private static final int MIN_VALUE = 0;
    private static final int ONE_UPDATE = 1;

    public Product(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sellIn=" + sellIn +
                ", quality=" + quality +
                '}';
    }

    void increaseQuality(){
        if (quality < MAX_QUALITY) {
            quality += ONE_UPDATE;
        }
    }

    void decreaseQuality(){
        if (quality > MIN_VALUE) {
            quality -= ONE_UPDATE;
        }
    }

    void updateSellIn(){
        sellIn -= ONE_UPDATE;
    }

    boolean isExpire() {
        return sellIn < MIN_VALUE;
    }

}
