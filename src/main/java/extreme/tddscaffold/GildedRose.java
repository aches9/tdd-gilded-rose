package extreme.tddscaffold;

public class GildedRose {


    public Product updateProduct(Product product){
        product.sellIn -= 1;
        if("Aged Brie".equals(product.name)){
            if(product.quality < 50){
                if(product.sellIn < 1){
                    product.quality += 2;
                }else {
                    product.quality += 1;
                }
            }

        }else {
            if( product.sellIn > 0 ){
                if(product.quality>0){
                    product.quality -= 1;
                }
            }else {
                if(product.quality>0){
                    product.quality -= 2;
                }
            }
        }
        return product;
    }
}
