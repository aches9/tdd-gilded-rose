package extreme.tddscaffold;

public class GildedRose {

    private static final String AGED_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras";
    private static final String BACKSTAGE_PASS = "Backstage Pass";
    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;
    private static final int SELL_IN_DROP = 1;
    private static final int ONE_QUALITY = 1;
    private static final int BEFORE_SHOW_10_DAYS = 11;
    private static final int BEFORE_SHOW_5_DAYS = 6;
    private static final int AFTER_SHOW_DAY = -1;
    private static final int SELL_IN_ZERO = 0;

    public Product updateProduct(Product product){

        if(SULFURAS.equals(product.name)){
            return product;
        }

        product.sellIn -= SELL_IN_DROP;

        if(BACKSTAGE_PASS.equals(product.name)){
            if(product.sellIn > AFTER_SHOW_DAY){
                LTMaxQualityPlusOneQuality(product);
                if(product.sellIn < BEFORE_SHOW_10_DAYS){
                    LTMaxQualityPlusOneQuality(product);
                }
                if(product.sellIn < BEFORE_SHOW_5_DAYS){
                    LTMaxQualityPlusOneQuality(product);
                }
            }else {
                product.quality = MIN_QUALITY;
            }
        }else if(AGED_BRIE.equals(product.name)){
            LTMaxQualityPlusOneQuality(product);
            if(product.sellIn < SELL_IN_ZERO){
                LTMaxQualityPlusOneQuality(product);
            }
        }else {
            GTMinQualityMinusOneQuality(product);
            if(product.sellIn < SELL_IN_ZERO){
                GTMinQualityMinusOneQuality(product);
            }
        }
        return product;
    }

    public static Product GTMinQualityMinusOneQuality (Product product){
        if(product.quality > MIN_QUALITY){
            product.quality -= ONE_QUALITY;
        }
        return product;
    }

    public static Product LTMaxQualityPlusOneQuality (Product product){
        if(product.quality < MAX_QUALITY){
            product.quality += ONE_QUALITY;
        }
        return product;
    }
}
