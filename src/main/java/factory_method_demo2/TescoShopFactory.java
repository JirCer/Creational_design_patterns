package factory_method_demo2;

public class TescoShopFactory extends ShopFactory{
    @Override
    public Shop createShop() {
        return new TescoShop();
    }
}

